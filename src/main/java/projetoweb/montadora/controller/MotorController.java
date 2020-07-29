package projetoweb.montadora.controller;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetoweb.montadora.model.Motor;
import projetoweb.montadora.service.MotorService;

import java.util.List;

@RestController
@RequestMapping("/motor")
@CrossOrigin(origins = "http://localhost:3000", exposedHeaders = "X-Total-Count")
public class MotorController {
    private MotorService service;

    public MotorController(MotorService service){
        this.service = service;
    }

    @GetMapping
    public List<Motor> listAll(){
        return service.getAll();
    }

    @GetMapping(path = {"/{id}"})
    public Motor getOne(@PathVariable Long id){
        return service.getOne(id);
    }

    @PostMapping
    public Motor insert(@RequestBody Motor m) {
        return service.insert(m);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Motor> update(@PathVariable Long id, @RequestBody Motor m){
        if(service.getOne(id) == null){
            return ResponseEntity.notFound().build();
        }else{
            service.update(m);
            Motor updated = service.getOne(id);
            return ResponseEntity.ok().body(updated);
        }
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return service
                .findById(id)
                .map(record -> {
                    service.delete(record);
                    return ResponseEntity.status(202).build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
