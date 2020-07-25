package projetoweb.montadora.controller;

import org.springframework.web.bind.annotation.*;
import projetoweb.montadora.model.Motor;
import projetoweb.montadora.service.MotorService;

import java.util.List;

@RestController
@RequestMapping("/motor")
public class MotorController {
    private MotorService service;

    public MotorController(MotorService service){
        this.service = service;
    }

    @GetMapping
    public List<Motor> listAll(){
        return service.getAll();
    }

    @GetMapping(path = {"/id"})
    public Motor getOne(@PathVariable Long id){
        return service.getOne(id);
    }

    @PostMapping
    public Motor insert(@RequestBody Motor m) {
        return service.insert(m);
    }
}
