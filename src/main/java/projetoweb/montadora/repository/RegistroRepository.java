package projetoweb.montadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoweb.montadora.model.Registro;

public interface RegistroRepository extends JpaRepository<Registro, Long> {
}
