package projetoweb.montadora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetoweb.montadora.model.Peca;
import projetoweb.montadora.repository.PecaRepository;

import java.util.List;

@Service
public class PecaService {
    private PecaRepository pecaRepository;

    @Autowired
    private void setPecaRepository(PecaRepository repository){this.pecaRepository = repository;}

    public Peca insert(Peca p){
        return pecaRepository.save(p);
    }
    public Peca update(Peca p){
        return pecaRepository.save(p);
    }
    public void delete(Peca p){
        pecaRepository.delete(p);
    }
    public Peca getOne(Long id){
        return pecaRepository.findById(id).orElse(null);
    }
    public List<Peca> getAll(){
        return pecaRepository.findAll();
    }
}
