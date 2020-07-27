package projetoweb.montadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import projetoweb.montadora.model.Moto;
import projetoweb.montadora.model.Motor;
import projetoweb.montadora.model.Peca;
import projetoweb.montadora.model.Registro;
import projetoweb.montadora.repository.MotoRepository;
import projetoweb.montadora.repository.MotorRepository;
import projetoweb.montadora.repository.PecaRepository;
import projetoweb.montadora.repository.RegistroRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
public class TestDataBase implements ApplicationRunner {
    @Autowired
    MotoRepository motoRepository;

    @Autowired
    MotorRepository motorRepository;

    @Autowired
    PecaRepository pecaRepository;

    @Autowired
    RegistroRepository registroRepository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        //testes aqui
    }
}