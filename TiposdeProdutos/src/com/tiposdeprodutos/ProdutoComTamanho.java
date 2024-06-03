package com.tiposdeprodutos;

import java.util.Objects;

public class ProdutoComTamanho extends Produto {
    private String tamanho;

    public ProdutoComTamanho(String nome, String codigo, double preco, String tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProdutoComTamanho)) return false;
        if (!super.equals(o)) return false;
        ProdutoComTamanho that = (ProdutoComTamanho) o;
        return tamanho.equals(that.tamanho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tamanho);
    }
}
