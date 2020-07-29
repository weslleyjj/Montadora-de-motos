package projetoweb.montadora.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PecaMotor {
    private Long motor;
    private Long peca;
    public PecaMotor(Long motor, Long peca){
        this.motor = motor;
        this.peca = peca;
    }
}
