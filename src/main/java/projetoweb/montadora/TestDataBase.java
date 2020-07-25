package projetoweb.montadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import projetoweb.montadora.model.Moto;
import projetoweb.montadora.model.Motor;
import projetoweb.montadora.model.Peca;
import projetoweb.montadora.repository.MotoRepository;
import projetoweb.montadora.repository.MotorRepository;
import projetoweb.montadora.repository.PecaRepository;

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

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        //-----------------------
        Peca p1 = new Peca();
        Peca p2 = new Peca();
        p1.setCategoria("borrachas");
        p1.setFabricacao(2001);
        p1.setNome("junta cabeçote");
        p1.setValor(45.34);
        p2.setCategoria("borrachas");
        p2.setFabricacao(2009);
        p2.setNome("junta cilindro");
        p2.setValor(28.94);
        Motor m1 = new Motor();
        m1.setCilindrada(150);
        m1.setFabricacao(2006);
        m1.setPotencia("12cv");
        m1.setTipo("DOHC");
        p1.setMotor(m1);
        p2.setMotor(m1);
        Moto n1 = new Moto();
        n1.setMotor(m1);
        n1.setModelo("factor");
        n1.setAno(1999);
        n1.setCor("azul");
        n1.setValor(15000.00);
        List<Peca> lista = new ArrayList<>();
        List<Moto> listamoto = new ArrayList<>();
        listamoto.add(n1);
        p2.setMoto(listamoto);
        p1.setMoto(listamoto);
        lista.add(p1);
        lista.add(p2);
        n1.setPeca(lista);
        m1.setPeca(lista);


        //-----------------------

        Motor m2 = new Motor();
        Motor m3 = new Motor();
        m2.setCilindrada(249);
        m3.setCilindrada(669);
        //----------------------

        Moto n2 = new Moto();
        Moto n3 = new Moto();

        n2.setMotor(m2);
        n2.setModelo("fazer");
        n3.setMotor(m3);
        n3.setModelo("mt-07");
        //---------------------

        motorRepository.save(m1);
        motorRepository.save(m2);
        motorRepository.save(m3);
        motoRepository.save(n1);
        motoRepository.save(n2);
        motoRepository.save(n3);
        pecaRepository.save(p1);
        pecaRepository.save(p2);

        //----------------------

        /*
        Motor m1 = new Motor();
        m1.setCilindrada(150);
        m1.setPotencia("14cv");
        m1.setTipo("DOHC");
        Peca p1 = new Peca();
        p1.setMotor(m1);
        p1.setNome("junta cabeçote");
        p1.setCategoria("borracha");
        Peca p2 = new Peca();
        p2.setMotor(m1);
        p2.setNome("parafuso cabeçote");
        p2.setCategoria("parafuso");
        List<Peca> lista = new ArrayList<>();
        List<Moto> listamoto = new ArrayList<>();
        Moto n2 = new Moto();
        n2.setMotor(m1);
        listamoto.add(n2);
        p1.setMoto(listamoto);
        p2.setMoto(listamoto);
        lista.add(p1);
        lista.add(p2);

        m1.setPeca(lista);



        motorRepository.save(m1);
        motoRepository.save(n2);
        pecaRepository.save(p1);
        pecaRepository.save(p2);
        */
    }
}


/*package projetoweb.montadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MontadoraApplication {

    public static void main(String[] args) {
        SpringApplication.run(MontadoraApplication.class, args);
    }

}
*/
