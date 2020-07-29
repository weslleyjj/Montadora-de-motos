package projetoweb.montadora.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Random;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String lote;
    Long numSerie;
    //@OneToOne(mappedBy = "registro",cascade = CascadeType.ALL, orphanRemoval = true)
    //Moto moto;

}
