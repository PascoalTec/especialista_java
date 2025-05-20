package com.algaworks.desafio_excecoes;

public class OperacaoBancariaException extends RuntimeException {
    
    public OperacaoBancariaException(String message) {
        super(message);
    }
    
    public OperacaoBancariaException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
