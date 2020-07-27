package projetoweb.montadora.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetoweb.montadora.model.Peca;
import projetoweb.montadora.service.PecaService;

import java.util.List;

@RestController
@RequestMapping("/peca")
public class PecaController {
    private PecaService service;

    public PecaController(PecaService service){this.service = service;}

    @GetMapping
    public List<Peca> listAll(){
        return service.getAll();
    }
    @GetMapping(path = "/{id}")
    public Peca getOne(@PathVariable Long id){return service.getOne(id);}
    @PostMapping
    public Peca insert(@RequestBody Peca p){
        return service.insert(p);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Peca> update(@PathVariable Long id, @RequestBody Peca p){
        if(service.getOne(id) == null){
            return ResponseEntity.notFound().build();
        }else{
            service.update(p);
            Peca updated = service.getOne(id);
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
