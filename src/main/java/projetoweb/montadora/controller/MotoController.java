package projetoweb.montadora.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetoweb.montadora.model.Moto;
import projetoweb.montadora.service.MotoService;

import java.util.List;

@RestController
@RequestMapping("/moto")
public class MotoController {
    private MotoService service;

    public MotoController(MotoService service){
        this.service = service;
    }

    @GetMapping
    public List<Moto> listAll(){
        return service.getAll();
    }

    @GetMapping(path = {"/{id}"})
    public Moto getOne(@PathVariable Long id){
        return service.getOne(id);
    }

    @PostMapping
    public Moto insert(@RequestBody Moto m) {
        return service.insert(m);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Moto> update(@PathVariable Long id, @RequestBody Moto m){
        if(service.getOne(id) == null){
            return ResponseEntity.notFound().build();
        }else{
            service.update(m);
            Moto updated = service.getOne(id);
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
