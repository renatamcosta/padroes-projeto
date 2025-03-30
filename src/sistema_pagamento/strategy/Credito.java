package sistema_pagamento.strategy;

public class Credito implements FormaPagamento {

    public Credito(Double limite) {
        this.limite = limite;
    }
    private Double limite;
    @Override
    public void pagar(Double valorPedido) {
        if (limite >= valorPedido) {
            System.out.println("Pagamento realizado no cartão de crédito no valor de R$ " + valorPedido);
        }else{
            System.out.println("Transação não autorizada");
        }
    }
}
