package com.contaspagar.modelo;

import com.algaworks.pagamento.Beneficiario;
import com.algaworks.pagamento.DocumentoPagavel;

public class OrdemServico implements DocumentoPagavel {
    
    private Beneficiario fonercedor;
    private double valorTotal;

    
    public OrdemServico(Beneficiario fonercedor, double valorTotal) {
        this.fonercedor = fonercedor;
        this.valorTotal = valorTotal;
    }

    public Beneficiario getFonercedor() {
        return fonercedor;
    }
    public void setFonercedor(Beneficiario fonercedor) {
        this.fonercedor = fonercedor;
    }

    
    @Override
    public double getValorTotal() {
        return 0;
    }
    
    @Override
    public Beneficiario getBeneficiario() {
        return null;
    }


}
