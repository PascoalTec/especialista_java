package com.algaworks.desafio_excecoes;

public class SaldoInsuficienteException extends OperacaoBancariaException {

     public SaldoInsuficienteException(String message) {
        super(message);
     }

        public SaldoInsuficienteException(String message, Throwable cause) {
            super(message, cause);
        }
}
