package projetoweb.montadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoweb.montadora.model.Moto;

public interface MotoRepository extends JpaRepository<Moto, Long> {
}
