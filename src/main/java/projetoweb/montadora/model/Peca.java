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
    String tipo;
    @ManyToMany
    @JoinTable(
            name = "peca_motor", joinColumns = @JoinColumn(name = "peca_id", referencedColumnName = "id_peca"),
            inverseJoinColumns = @JoinColumn(name = "motor_id")
    )
    List<Motor> motor;

}
