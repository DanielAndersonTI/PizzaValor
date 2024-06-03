package com.tiposdeprodutos;

import java.util.Objects;

public class Produto {
    private String nome;
    private String codigo;
    private double preco;

    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }



	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo.equals(produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }



	
}