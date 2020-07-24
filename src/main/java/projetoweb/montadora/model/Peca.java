package projetoweb.montadora.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Peca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_peca;
    String nome;
    String Categoria;
    Integer fabricacao;
    double valor;
    @ManyToOne
    @JoinColumn(name = "motor_referencia")
    Motor motor;
    @ManyToMany
    @JoinTable(
            name = "peca_referencia_moto", joinColumns = @JoinColumn(name = "peca_referencia",
            referencedColumnName = "id_peca"), inverseJoinColumns = @JoinColumn(name = "peca_moto_modelo")
    )
    List<Moto> moto;

}
