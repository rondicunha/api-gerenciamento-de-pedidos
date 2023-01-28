package br.com.lrbolosdoces.lrbolosdoces.repository;

import br.com.lrbolosdoces.lrbolosdoces.model.Gestor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGestorRepository extends JpaRepository<Gestor, Long> {
}
