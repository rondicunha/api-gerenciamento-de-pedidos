package br.com.lrbolosdoces.lrbolosdoces.controller;

import br.com.lrbolosdoces.lrbolosdoces.model.Gestor;
import br.com.lrbolosdoces.lrbolosdoces.repository.IEnderecoRepository;
import br.com.lrbolosdoces.lrbolosdoces.repository.IGestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gestor")
public class GestorController {

    @Autowired
    private IGestorRepository iGestorRepository;
    @Autowired
    private IEnderecoRepository iEnderecoRepository;

    @GetMapping
    public List<Gestor> listarGestores (){
        return (List<Gestor>) iGestorRepository.findAll();
    }

    @PostMapping
    public Gestor cadastraGestor (@RequestBody Gestor gestor){
        Gestor novoGestor = iGestorRepository.save(gestor);
        return novoGestor;
    }

    @PutMapping
    public Gestor editarGestor (@RequestBody Gestor gestor){
        Gestor novoGestor = iGestorRepository.save(gestor);
        return novoGestor;
    }

    @DeleteMapping("/{id}")
    public Optional<Gestor> deleteGestor(@PathVariable Long id){
        Optional<Gestor> gestor = iGestorRepository.findById(id);
        iEnderecoRepository.deleteById(id);

        return gestor;
    }


}
