package com.tiposdeprodutos;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    private Map<Produto, Integer> produtos = new HashMap<>();

    public void adicionaProduto(Produto produto, int quantidade) {
        produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
    }

    public void removeProduto(Produto produto, int quantidade) {
        if (!produtos.containsKey(produto)) {
            return;
        }
        int currentQuantity = produtos.get(produto);
        if (currentQuantity > quantidade) {
            produtos.put(produto, currentQuantity - quantidade);
        } else {
            produtos.remove(produto);
        }
    }

    public double valorTotalDaCompra() {
        return produtos.entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPreco() * entry.getValue())
                .sum();
    }
}


