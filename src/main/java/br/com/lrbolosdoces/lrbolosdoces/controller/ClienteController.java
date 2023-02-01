package br.com.lrbolosdoces.lrbolosdoces.controller;

import br.com.lrbolosdoces.lrbolosdoces.model.Cliente;
import br.com.lrbolosdoces.lrbolosdoces.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private IClienteRepository iClienteRepository;

    @GetMapping
    public List<Cliente> listaClientes() {
        return (List<Cliente>) iClienteRepository.findAll();
    }

    @PostMapping
    public Cliente cadastraCliente(@RequestBody Cliente cliente) {
        Cliente novoCliente = iClienteRepository.save(cliente);
        return novoCliente;
    }

    @PutMapping
    public Cliente editarCliente(@RequestBody Cliente cliente) {
        Cliente novoCliente = iClienteRepository.save(cliente);
        return novoCliente;
    }

    @DeleteMapping("/{id}")
    public Optional<Cliente> deleteCliente(@PathVariable Long id) {
        Optional<Cliente> cliente = iClienteRepository.findById(id);

        iClienteRepository.deleteById(id);

        return cliente;
    }
}
