package sistema_pagamento.strategy;

public class Debito implements FormaPagamento {
    private Double saldo;
    public Debito(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void pagar(Double valorPedido) {

        if (saldo >= valorPedido) {
            System.out.println("Pagamento realizado no cartão de débito no valor de R$ " + valorPedido);
        }else{
            System.out.println("Transação não autorizada");
        }
    }
}
