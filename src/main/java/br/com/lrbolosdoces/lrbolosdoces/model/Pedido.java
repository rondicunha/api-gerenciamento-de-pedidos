package br.com.lrbolosdoces.lrbolosdoces.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    @JoinColumn(name = "produto_id")
    private List<Produto> produto;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    private float valorTotal;
    private String statusProducao;
    private String statusPagamento;
    private String observacao;
    private String horario;
    private String tipoEntrega;
    private float valorEntrega;

    public Pedido() {
    }

    public Pedido(Long id, List<Produto> produto, Cliente cliente,
                  Endereco endereco, float valorTotal, String statusProducao,
                  String statusPagamento, String observacao, String horario,
                  String tipoEntrega, float valorEntrega) {

        this.id = id;
        this.produto = produto;
        this.cliente = cliente;
        this.endereco = endereco;
        this.valorTotal = valorTotal;
        this.statusProducao = statusProducao;
        this.statusPagamento = statusPagamento;
        this.observacao = observacao;
        this.horario = horario;
        this.tipoEntrega = tipoEntrega;
        this.valorEntrega = valorEntrega;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatusProducao() {
        return statusProducao;
    }

    public void setStatusProducao(String statusProducao) {
        this.statusProducao = statusProducao;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public float getValorEntrega() {
        return valorEntrega;
    }

    public void setValorEntrega(float valorEntrega) {
        this.valorEntrega = valorEntrega;
    }
}
