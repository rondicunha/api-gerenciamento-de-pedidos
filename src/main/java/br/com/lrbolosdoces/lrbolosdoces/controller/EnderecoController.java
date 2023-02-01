package br.com.lrbolosdoces.lrbolosdoces.controller;

import br.com.lrbolosdoces.lrbolosdoces.model.Endereco;
import br.com.lrbolosdoces.lrbolosdoces.repository.IEnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private IEnderecoRepository iEnderecoRepository;

    @GetMapping
    public List<Endereco> listaEnderecos() {

        return (List<Endereco>) iEnderecoRepository.findAll();
    }

    @PostMapping
    public Endereco cadastraEndereco(@RequestBody Endereco endereco) {
        Endereco novoEndereco = iEnderecoRepository.save(endereco);
        return novoEndereco;
    }

    @PutMapping
    public Endereco editarEndereco(@RequestBody Endereco endereco) {
        Endereco novoEndereco = iEnderecoRepository.save(endereco);
        return novoEndereco;
    }

    @DeleteMapping("/{id}")
    public Optional<Endereco> deleteEndereco(@PathVariable Long id) {
        Optional<Endereco> endereco = iEnderecoRepository.findById(id);

        iEnderecoRepository.deleteById(id);

        return endereco;
    }
}
