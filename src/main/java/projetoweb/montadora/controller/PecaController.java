package projetoweb.montadora.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetoweb.montadora.model.Motor;
import projetoweb.montadora.model.Peca;
import projetoweb.montadora.model.PecaMotor;
import projetoweb.montadora.service.PecaService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/peca")
@CrossOrigin(origins = "http://localhost:3000", exposedHeaders = "X-Total-Count")
public class PecaController {
    private PecaService service;

    public PecaController(PecaService service){this.service = service;}

    @GetMapping
    public List<Peca> listAll(){
        return service.getAll();
    }
    @GetMapping(path = "/{id}")
    public Peca getOne(@PathVariable Long id){return service.getOne(id);}
    @GetMapping(path = "/peca-motor")
    public List<PecaMotor> referencia(){
        List<PecaMotor> lista = new ArrayList<>();
        List<Peca> pecas;
        pecas = listAll();
        if(pecas != null){
            for(Peca p : pecas){
                List<Motor> m1 = p.getMotor();
                for(Motor m : m1){
                    lista.add(new PecaMotor(m.getId(), p.getId()));
                }
            }
        }
        List<List<PecaMotor>> retorno = new ArrayList<>();
        retorno.add(lista);
        return lista;
    }
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
