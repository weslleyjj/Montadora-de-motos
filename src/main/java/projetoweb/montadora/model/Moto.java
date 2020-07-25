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
public class Moto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_moto;
    String modelo;
    String cor;
    Integer ano;
    double valor;
    @OneToOne
    //@JsonIgnore
    @JoinColumn(name = "moto_motor")
    Motor motor;
    @OneToMany(mappedBy = "id_peca")
    List<Peca> peca;
}
