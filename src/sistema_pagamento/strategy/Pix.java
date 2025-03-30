package sistema_pagamento.strategy;

public class Pix implements FormaPagamento{
    public Pix(Double saldo) {
        this.saldo = saldo;
    }

    private Double saldo;
    @Override
    public void pagar(Double valorPedido) {
        if (saldo >= valorPedido) {
            System.out.println("Pagamento realizado no cartão de débito no valor de R$ " + valorPedido);
        }else{
            System.out.println("Saldo insuficiente");
        }

    }
}
