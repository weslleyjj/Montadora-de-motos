package projetoweb.montadora.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonIgnore
    @JoinColumn(name = "motor_referencia")
    Motor motor;
    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "peca_referencia_moto", joinColumns = @JoinColumn(name = "peca_referencia",
            referencedColumnName = "id_peca"), inverseJoinColumns = @JoinColumn(name = "peca_moto_modelo")
    )
    List<Moto> moto;

}
