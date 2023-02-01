package br.com.lrbolosdoces.lrbolosdoces.controller;

import br.com.lrbolosdoces.lrbolosdoces.model.Produto;
import br.com.lrbolosdoces.lrbolosdoces.repository.IProdutoRepository;
import br.com.lrbolosdoces.lrbolosdoces.repository.IProdutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private IProdutoRepository iProdutoRepository;
    @Autowired
    private IProdutorRepository iProdutorRepository;

    @GetMapping
    public List<Produto> listarProdutos() {
        return (List<Produto>)iProdutoRepository.findAll();
    }

    @PostMapping
    public Produto cadastraProduto (@RequestBody Produto produto){
        Produto novoProduto = iProdutoRepository.save(produto);
        return novoProduto;
    }

    @PutMapping
    public Produto editarProduto (@RequestBody Produto produto){
        Produto novoProduto = iProdutoRepository.save(produto);
        return novoProduto;
    }

    @DeleteMapping("/{id}")
    public Optional<Produto> deleteProduto (@PathVariable Long id) {
        Optional<Produto> produto = iProdutoRepository.findById(id);
        iProdutoRepository.deleteById(id);
        return produto;
    }
}
