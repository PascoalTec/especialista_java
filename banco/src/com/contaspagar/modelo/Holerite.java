package com.contaspagar.modelo;

import com.algaworks.pagamento.Beneficiario;
import com.algaworks.pagamento.DocumentoPagavel;

public class Holerite implements DocumentoPagavel {

    private Beneficiario funcionario;
    private double valorHora;
    private int quantidadeHora;

    
    @Override
    public double getValorTotal() {
        return getValorHora() * getQuantidadeHora();
    }

    @Override
    public Beneficiario getBeneficiario() {
        return getFuncionario();
    }


    public Holerite(Beneficiario funcionario, double valorHora, int quantidadeHora) {
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.quantidadeHora = quantidadeHora;
    }


    public Beneficiario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Beneficiario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQuantidadeHora() {
        return quantidadeHora;
    }

    public void setQuantidadeHora(int quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }
    
}
