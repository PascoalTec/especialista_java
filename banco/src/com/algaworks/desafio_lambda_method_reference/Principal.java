package com.algaworks.desafio_lambda_method_reference;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class Principal {
    
    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
		funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
		funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
		funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));


        funcionarios.removeIf(Funcionario::isInativo);

        funcionarios.sort(Comparator.comparing(Funcionario::getSalario));

        funcionarios.forEach(Principal::imprimir);
    }



    private static void imprimir(Funcionario funcionario) {
		// implementar a impressão do nome, salário e impostos (20%)
		System.out.printf("Nome: %s - Salário: %s - Impostos: %s%n",
				funcionario.getNome(), funcionario.getSalario(),
				funcionario.getSalario().multiply(new BigDecimal("0.20")));
	}
}
