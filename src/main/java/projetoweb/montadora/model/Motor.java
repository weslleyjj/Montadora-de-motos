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
public class Motor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String cilindrada;
    Integer fabricacao;
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "motor")
    //List<Moto>  moto;
    public Long getId(){
        return id;
    }
}
