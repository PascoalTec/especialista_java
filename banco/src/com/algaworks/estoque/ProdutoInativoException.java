package com.algaworks.estoque;

public class ProdutoInativoException extends ProdutoException {

    private static final long serialVersionUID = 1L;

    public ProdutoInativoException(String message) {
        super(message);
    }

}