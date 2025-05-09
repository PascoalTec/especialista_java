package com.algaworks.financeira.servico;

import com.algaworks.financeira.modelo.PessoaBonificavel;

public class ServicoPagamentoBonus {
    
    public void pagarBonus(PessoaBonificavel pessoaBonificavel, double percentualMetaAlcancada) {
        double valorBonus = pessoaBonificavel.calcularBonus(percentualMetaAlcancada);

        
        System.out.printf("DEBUG: Bônus pago no valor de %.2f", valorBonus);

    }
}
