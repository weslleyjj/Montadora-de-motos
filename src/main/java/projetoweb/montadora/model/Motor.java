package projetoweb.montadora.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @OneToMany(mappedBy = "id_peca")
    List<Peca> peca;

}
