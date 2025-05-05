package com.contaspagar.servico;

import com.algaworks.pagamento.DocumentoPagavel;
import com.algaworks.pagamento.MetodoPagamento;

public class ServicoContaPagar {
    
    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {

        metodoPagamento.pagar(documento);
    }

}
