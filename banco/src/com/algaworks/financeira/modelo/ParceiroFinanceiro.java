package com.algaworks.financeira.modelo;

public class ParceiroFinanceiro extends Empresa {
    
    private double valorTotalAplicado;

    @Override
    public double calcularLimiteAprovado() {
        // Implement the logic for calculating the approved limit
        return valorTotalAplicado * 0.1; // Example logic: 10% of the total applied value
    }

    public ParceiroFinanceiro(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    public double getValorTotalAplicado() {
        return valorTotalAplicado;
    }

    public void adicionarNovaAplicacao(double valorAplicado) {
        valorTotalAplicado += valorAplicado;
    }
    
}
