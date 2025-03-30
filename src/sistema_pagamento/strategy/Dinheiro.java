package sistema_pagamento.strategy;

public class Dinheiro implements FormaPagamento{
    private Double valorRecebido;
    public Dinheiro(Double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }
    @Override
    public void pagar(Double valorPedido) {
        if (valorRecebido > valorPedido) {
            valorRecebido -= valorPedido;
            System.out.println("Pagamento realizado em dinheiro no valor de R$ " + valorPedido + "com troco de " + valorRecebido );
        }else {
            System.out.println("Pagamento realizado em dinheiro no valor de R$ " + valorPedido);
        }
    }
}
