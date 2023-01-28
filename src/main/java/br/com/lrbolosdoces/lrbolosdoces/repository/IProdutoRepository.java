package br.com.lrbolosdoces.lrbolosdoces.repository;

import br.com.lrbolosdoces.lrbolosdoces.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProdutoRepository extends JpaRepository<Produto, Long> {
}
