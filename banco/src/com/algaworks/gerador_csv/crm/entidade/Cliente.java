package com.algaworks.gerador_csv.crm.entidade;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cliente {

    private final Long codigo;
    private final String nome;
    private final LocalDate dataNascimento;
    private BigDecimal limiteCredito = new BigDecimal("12000");

    public Cliente(Long codigo, String nome, LocalDate dataNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

}
