package projetoweb.montadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoweb.montadora.model.Peca;

public interface PecaRepository extends JpaRepository<Peca, Long> {
}
