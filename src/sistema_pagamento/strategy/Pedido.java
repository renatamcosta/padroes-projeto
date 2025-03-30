package sistema_pagamento.strategy;

public class Pedido {
    private Double valorPedido;
    public Pedido(Double pedido) {
        this.valorPedido = pedido;
    }
    public FormaPagamento formaPagamento;
    public void finalizarPedido() {
        formaPagamento.pagar(valorPedido);
    }

}
