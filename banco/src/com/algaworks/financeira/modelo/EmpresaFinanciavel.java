package com.algaworks.financeira.modelo;

public abstract class EmpresaFinanciavel extends Empresa implements ClienteFinanciavel {

    
    private String razaoSocial;
    private double totalFaturamento;
    
    
    public EmpresaFinanciavel(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    @Override
    public double calcularJuros(double valorSolicitado) {
        return 0.8;
    }
}
