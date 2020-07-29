/*package projetoweb.montadora;

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
        /*Motor m1 = new Motor();
        Motocicleta mo1 = new Motocicleta();
        Peca p1 = new Peca();
        Registro r1 = new Registro();
        m1.setFabricacao(2020);
        m1.setCilindrada("160cc");
        mo1.setRegistro(r1);
        mo1.setAno(2020);
        mo1.setModelo("Titan");
        List<Motocicleta> listamoto = new ArrayList<>();
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
        pecaRepository.save(p1);*//*
        //-------------
        Moto mo1 = new Moto();
        Registro r1 = new Registro();
        mo1.setRegistro(r1);
        mo1.setModelo("Factor");
        mo1.setAno(2018);
        motoRepository.save(mo1);
        Motor m1 = new Motor();
        m1.setCilindrada("312cc");
        m1.setFabricacao(1990);
        motorRepository.save(m1);
        Moto mo2 = new Moto();
        Registro r2 = new Registro();
        mo2.setRegistro(r2);
        mo2.setMotor(m1);
        mo2.setModelo("mt-03");
        mo2.setAno(2020);
        motoRepository.save(mo2);
        Peca pec1 = new Peca();
        pec1.setNome("Parafuso");
        pec1.setTipo("peça qualquer");
        pecaRepository.save(pec1);
        Peca pec2 = new Peca();
        List<Motor> listamotor = new ArrayList<>();
        listamotor.add(m1);
        pec2.setMotor(listamotor);
        pec2.setNome("junta");
        pec2.setTipo("juntas");
        pecaRepository.save(pec2);
        Motor m2 = new Motor();
        m2.setCilindrada("160cc");
        m2.setFabricacao(2008);
        motorRepository.save(m2);
        listamotor.remove(m1);
        listamotor.add(m2);
        pec2.setMotor(listamotor);
        pecaRepository.save(pec2);
        //mo1.setMotor(m1);
        //motoRepository.save(mo1);
    }
}
*/