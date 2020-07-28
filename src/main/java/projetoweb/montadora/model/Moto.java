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
    Integer ano;
    @ManyToOne//(cascade = CascadeType.ALL)
    @JoinColumn(name = "motor_id")
    Motor motor;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "registro_id")
    Registro registro;
}
