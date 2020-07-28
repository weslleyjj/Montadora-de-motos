package projetoweb.montadora.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_registro;
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long chassi;
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long lote;
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long numSerie;
    //@OneToOne(mappedBy = "registro",cascade = CascadeType.ALL, orphanRemoval = true)
    //Moto moto;

}
