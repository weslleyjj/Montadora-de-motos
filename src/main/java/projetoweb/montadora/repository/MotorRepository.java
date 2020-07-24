package projetoweb.montadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoweb.montadora.model.Motor;

public interface MotorRepository extends JpaRepository<Motor, Long> {
}
