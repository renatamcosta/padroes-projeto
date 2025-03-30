package sistema_pagamento.strategy;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(100.00);
//        pedido.formaPagamento = new Credito(150.0);
//        pedido.formaPagamento = new Dinheiro(150.0);
        pedido.formaPagamento = new Pix(50.0);

        pedido.finalizarPedido();

    }
}
