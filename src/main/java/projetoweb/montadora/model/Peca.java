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
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Peca_Motor", joinColumns = @JoinColumn(name = "Peca_id", referencedColumnName = "id_Peca"),
            inverseJoinColumns = @JoinColumn(name = "Motor_id")
    )
    List<Motor> motor;

}
