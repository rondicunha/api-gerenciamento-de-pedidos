package br.com.lrbolosdoces.lrbolosdoces.repository;

import br.com.lrbolosdoces.lrbolosdoces.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedidoRepository extends JpaRepository<Pedido, Long> {
}
