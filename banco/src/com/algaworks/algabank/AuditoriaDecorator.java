package com.algaworks.algabank;

import com.algaworks.javabank.Conta;

public class AuditoriaDecorator extends ContaBaseDecorator {

    private int quantidadeOperacoes;

    public AuditoriaDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    public int getQuantidadeOperacoes() {
        return quantidadeOperacoes;
    }

    @Override
    public void sacar(double valor) {
        quantidadeOperacoes++;
        getContaOriginal().sacar(valor);
        
    }

    @Override
    public void depositar(double valor) {
        quantidadeOperacoes++;
        getContaOriginal().depositar(valor);
        
    }

    @Override
    public void transferir(Conta conta, double valor) {
        quantidadeOperacoes++;
        getContaOriginal().transferir(conta, valor);
        
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        quantidadeOperacoes++;
        getContaOriginal().aplicarEmInvestimento(valor);
    }
    
}
