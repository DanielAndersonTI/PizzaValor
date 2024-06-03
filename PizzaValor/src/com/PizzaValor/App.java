package com.PizzaValor;

public class App {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Pizza peperoni = new Pizza();
        Pizza frango = new Pizza();
        Pizza portuguesa = new Pizza();

        peperoni.adicionaIngrediente("peperoni");
        peperoni.adicionaIngrediente("muzzarela");

        frango.adicionaIngrediente("frango");
        frango.adicionaIngrediente("catupiry");
        frango.adicionaIngrediente("milho");

        portuguesa.adicionaIngrediente("presunto");
        portuguesa.adicionaIngrediente("milho");
        portuguesa.adicionaIngrediente("ervilha");
        portuguesa.adicionaIngrediente("ovo cozido");
        portuguesa.adicionaIngrediente("muzzarela");
        
        carrinho.adicionarPizza(peperoni);
        carrinho.adicionarPizza(frango);
        carrinho.adicionarPizza(portuguesa);

        carrinho.imprimir();
        
        System.out.println();
        System.out.println("Ingredientes utilizados:");
        System.out.println(Pizza.ingredientesTotal);
    }
}