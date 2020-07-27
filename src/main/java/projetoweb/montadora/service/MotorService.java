package projetoweb.montadora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetoweb.montadora.model.Motor;
import projetoweb.montadora.repository.MotorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MotorService {
    private MotorRepository motorRepository;

    @Autowired
    private void setMotorRepository(MotorRepository repository){ this.motorRepository = repository; }
    public Motor insert(Motor m){
        return motorRepository.save(m);
    }
    public Motor update(Motor m){
        return motorRepository.save(m);
    }
    public void delete(Motor m){
        motorRepository.delete(m);
    }
    public Motor getOne(Long id){
        return motorRepository.findById(id).orElse(null);
    }
    public Motor SaveAndFlush(Motor m){
        return motorRepository.saveAndFlush(m);
    }

    public Optional<Motor> findById(Long id){
        return motorRepository.findById(id);
    }
    public List<Motor> getAll(){
        return motorRepository.findAll();
    }
}
