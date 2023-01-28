package br.com.lrbolosdoces.lrbolosdoces.repository;

import br.com.lrbolosdoces.lrbolosdoces.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
