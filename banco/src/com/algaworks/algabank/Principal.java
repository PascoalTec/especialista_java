package com.algaworks.algabank;

import com.algaworks.javabank.Conta;
import com.algaworks.javabank.ContaCorrente;

public class Principal {

    public static void main(String[] args) {
        PontuacaoDecorator pontuacao  = new PontuacaoDecorator(new ContaCorrente());
        Conta conta1 = new TributacaoDecorator(new ContaCorrente());
        Conta conta2 = new ContaCorrente();

        conta1.depositar(1000);
        conta1.sacar(100);
        conta1.transferir(conta2, 100);

        System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
        System.out.printf("Saldo da conta 2: %.2f%n", conta2.getSaldo());
        System.out.printf("Pontos da conta 1: %d%n", pontuacao.getPontos());
    }

}
