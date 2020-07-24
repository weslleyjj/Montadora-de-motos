package projetoweb.montadora.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import projetoweb.montadora.model.Peca;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Motor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_motor;
    String potencia;
    String tipo;
    Integer cilindrada;
    Integer fabricacao;
    @OneToMany(mappedBy = "id_peca", orphanRemoval = true)
    List<Peca> peca;

}
