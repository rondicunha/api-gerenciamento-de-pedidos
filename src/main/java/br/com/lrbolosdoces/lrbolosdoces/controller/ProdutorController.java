package br.com.lrbolosdoces.lrbolosdoces.controller;

import br.com.lrbolosdoces.lrbolosdoces.model.Produto;
import br.com.lrbolosdoces.lrbolosdoces.model.Produtor;
import br.com.lrbolosdoces.lrbolosdoces.repository.IProdutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtor")
public class ProdutorController {

    @Autowired
    private IProdutorRepository iProdutorRepository;

    @GetMapping
    public List<Produtor> listarProdutor() {

        return (List<Produtor>)iProdutorRepository.findAll();
    }

    @PostMapping
    public Produtor cadastraProdutor (@RequestBody Produtor produtor){
        Produtor novoProdutor = iProdutorRepository.save(produtor);
        return novoProdutor;
    }

    @PutMapping
    public Produtor editarProdutor (@RequestBody Produtor produtor){
        Produtor novoProdutor = iProdutorRepository.save(produtor);
        return novoProdutor;
    }

    @DeleteMapping("/{id}")
    public Optional<Produtor> deleteProdutor (@PathVariable Long id) {
        Optional<Produtor> produtor = iProdutorRepository.findById(id);
        iProdutorRepository.deleteById(id);
        return produtor;
    }
}
