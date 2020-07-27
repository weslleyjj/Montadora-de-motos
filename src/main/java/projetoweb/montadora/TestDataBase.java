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
        Motor m1 = new Motor();
        Moto mo1 = new Moto();
        Peca p1 = new Peca();
        Registro r1 = new Registro();
        m1.setFabricacao(2020);
        m1.setCilindrada("160cc");
        mo1.setRegistro(r1);
        mo1.setAno(2020);
        mo1.setModelo("Titan");
        List<Moto> listamoto = new ArrayList<>();
        listamoto.add(mo1);
        m1.setMoto(listamoto);
        mo1.setMotor(m1);
        p1.setNome("Pistão");
        p1.setTipo("Motor");
        List<Motor> listamotor = new ArrayList<>();
        listamotor.add(m1);
        p1.setMotor(listamotor);

        motorRepository.save(m1);
        registroRepository.save(r1);
        motoRepository.save(mo1);
        pecaRepository.save(p1);
    }
}