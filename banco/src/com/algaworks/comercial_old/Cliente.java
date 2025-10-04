package com.algaworks.comercial_old;

public class Cliente {
    
    public String nome;
    private double limiteCompras;

    public Cliente(String nome, double limiteCompras) {
        this.nome = nome;
        this.limiteCompras = limiteCompras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLimiteCompras() {
        return limiteCompras;
    }
}
