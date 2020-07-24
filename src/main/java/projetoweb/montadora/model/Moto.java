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
public class Moto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_moto;
    String modelo;
    String cor;
    Integer ano;
    double valor;
    @OneToOne
    @JoinColumn(name = "moto_motor")
    Motor motor;
    @OneToMany(mappedBy = "id_peca", orphanRemoval = true)
    List<Peca> peca;
}
