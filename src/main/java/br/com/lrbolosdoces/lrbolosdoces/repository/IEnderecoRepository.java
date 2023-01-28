package br.com.lrbolosdoces.lrbolosdoces.repository;

import br.com.lrbolosdoces.lrbolosdoces.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnderecoRepository extends JpaRepository<Endereco, Long> {
}
