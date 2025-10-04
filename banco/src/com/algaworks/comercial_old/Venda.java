package com.algaworks.comercial_old;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venda {
    
    private final Cliente cliente;
    private final List<ItemVenda> itens = new ArrayList<>();
    private double valorTotal;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<ItemVenda> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionarItem(ItemVenda item) {
        if (excedeLimiteCompra(item)) {
            throw new LimiteDeCompraExcedidoException(String.format("Limite atual: %.2f", cliente.getLimiteCompras()));
            
        }


        valorTotal += item.getValor();
        itens.add(item);
    }

    private boolean excedeLimiteCompra(ItemVenda item) {
        return valorTotal + item.getValor() > cliente.getLimiteCompras();
    }
}
