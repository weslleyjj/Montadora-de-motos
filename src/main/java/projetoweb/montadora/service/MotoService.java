package projetoweb.montadora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetoweb.montadora.model.Moto;
import projetoweb.montadora.repository.MotoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MotoService {
    private MotoRepository motoRepository;

    @Autowired
    private void setMotoRepository(MotoRepository repository){ this.motoRepository = repository; }
    public Moto insert(Moto m){
        return motoRepository.save(m);
    }
    public Moto update(Moto m){
        return motoRepository.save(m);
    }
    public void delete(Moto m){
        motoRepository.delete(m);
    }
    public Moto getOne(Long id){
        return motoRepository.findById(id).orElse(null);
    }
    public Moto SaveAndFlush(Moto m){
        return motoRepository.saveAndFlush(m);
    }

    public Optional<Moto> findById(Long id){
        return motoRepository.findById(id);
    }
    public List<Moto> getAll(){
        return motoRepository.findAll();
    }

}
