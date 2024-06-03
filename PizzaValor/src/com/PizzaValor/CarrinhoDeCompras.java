package com.PizzaValor;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private int precoTotal;
    private List<Pizza> pizzas = new ArrayList<>();
    private static int totalPizzas = 0;

    public CarrinhoDeCompras() {
    }

    public void adicionarPizza(Pizza pizza){
        if (pizza.getTotalIngredientes()==0)
            System.out.println("Erro ao adicionar pizza - Não há ingredientes");
        else{
            pizzas.add(pizza);
            System.out.println("Sucesso ao adicionar pizza");
            precoTotal += pizza.getPreco();
            totalPizzas ++;
        }
    }

    public int getPrecoTotal(){
        return precoTotal;
    }

    public void imprimir(){
        System.out.println();
        System.out.println("Pizzas:");
        System.out.println("Valor total: R$"+precoTotal);
    }

    public static int getTotalPizzas(){
        return totalPizzas;
    }

    public static void zerar(){
        totalPizzas = 0;
    }
}