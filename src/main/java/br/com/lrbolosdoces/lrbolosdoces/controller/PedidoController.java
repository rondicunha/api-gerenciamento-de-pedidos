package br.com.lrbolosdoces.lrbolosdoces.controller;

import br.com.lrbolosdoces.lrbolosdoces.model.Pedido;
import br.com.lrbolosdoces.lrbolosdoces.repository.IPedidoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private IPedidoRepository iPedidoRepository;

    @GetMapping
    public List<Pedido> listarPedidos() {
        return (List<Pedido>) iPedidoRepository.findAll();
    }

    @PostMapping
    public Pedido cadastraPedido(@RequestBody Pedido pedido) {
        Pedido novoPedido = iPedidoRepository.save(pedido);
        return novoPedido;
    }

    @PutMapping
    public Pedido editarPedido(@RequestBody Pedido pedido) {
        Pedido novoPedido = iPedidoRepository.save(pedido);
        return novoPedido;
    }

    @DeleteMapping("/{id}")
    public Optional<Pedido> deletePedido (@PathVariable Long id) {
        Optional<Pedido> pedido = iPedidoRepository.findById(id);
        iPedidoRepository.deleteById(id);
        return pedido;
    }
}
