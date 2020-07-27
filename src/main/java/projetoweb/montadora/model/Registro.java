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
    Long chassi;
    Long lote;
    Long numSerie;
    @OneToOne(mappedBy = "registro",cascade = CascadeType.ALL, orphanRemoval = true)
    Moto moto;

}
