package br.com.lrbolosdoces.lrbolosdoces.DAO;

import br.com.lrbolosdoces.lrbolosdoces.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDAO extends CrudRepository<Cliente, Long> {
}
