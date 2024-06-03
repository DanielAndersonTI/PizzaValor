package com.PizzaValor;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestePizza {
    @Before
    public void zerar(){
        Pizza.zerar();
        CarrinhoDeCompras.zerar();
    }
    
    @Test
    public void testeValorPizza15(){
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("peperoni");
        pizza.adicionaIngrediente("muzzarela");
        assertEquals(15, pizza.getPreco());
    }

    @Test
    public void testeValorPizza20(){
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("frango");
        pizza.adicionaIngrediente("catupiry");
        pizza.adicionaIngrediente("milho");
        assertEquals(20, pizza.getPreco());
    }

    @Test
    public void testeValorPizza23(){
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("presunto");
        pizza.adicionaIngrediente("milho");
        pizza.adicionaIngrediente("ervilha");
        pizza.adicionaIngrediente("ovo cozido");
        pizza.adicionaIngrediente("muzzarela");
        pizza.adicionaIngrediente("cebola");
        assertEquals(23, pizza.getPreco());
    }

    @Test
    public void testeIngredientesPizza(){
        List<String> ingredientes = new ArrayList<>();
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("frango");
        pizza.adicionaIngrediente("catupiry");
        pizza.adicionaIngrediente("milho");
        ingredientes.add("frango");
        ingredientes.add("catupiry");
        ingredientes.add("milho");
        assertEquals(ingredientes, pizza.getIngredientes());
    }

    @Test
    public void testeIngredientesVariasPizza(){
        HashMap<String,Integer> ingredientes = new HashMap<>();
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();

        pizza1.adicionaIngrediente("peperoni");
        pizza1.adicionaIngrediente("muzzarela");

        pizza2.adicionaIngrediente("frango");
        pizza2.adicionaIngrediente("catupiry");
        pizza2.adicionaIngrediente("milho");

        pizza3.adicionaIngrediente("presunto");
        pizza3.adicionaIngrediente("milho");
        pizza3.adicionaIngrediente("ervilha");
        pizza3.adicionaIngrediente("ovo cozido");
        pizza3.adicionaIngrediente("muzzarela");
        pizza3.adicionaIngrediente("cebola");

        ingredientes.put("peperoni",1);
        ingredientes.put("ovo cozido",1);
        ingredientes.put("ervilha",1);
        ingredientes.put("presunto",1);
        ingredientes.put("cebola",1);
        ingredientes.put("catupiry",1);
        ingredientes.put("frango",1);
        ingredientes.put("milho",2);
        ingredientes.put("muzzarela",2);
        
        assertEquals(ingredientes, Pizza.ingredientesTotal);
    }

    @Test
    public void testeIngredientesVariasPizza2(){
        HashMap<String,Integer> ingredientes = new HashMap<>();
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();

        pizza1.adicionaIngrediente("peperoni");
        pizza1.adicionaIngrediente("muzzarela");

        pizza2.adicionaIngrediente("peperoni");
        pizza2.adicionaIngrediente("muzzarela");

        ingredientes.put("peperoni",2);
        ingredientes.put("muzzarela",2);
        
        assertEquals(ingredientes, Pizza.ingredientesTotal);
    }

    @Test
    public void testePizzaVaziaCarrinho1(){
        Pizza pizza = new Pizza();
        CarrinhoDeCompras carinho = new CarrinhoDeCompras();

        carinho.adicionarPizza(pizza);

        assertEquals(0, CarrinhoDeCompras.getTotalPizzas());
    }

    @Test
    public void testePizzaVaziaCarrinho2(){
        Pizza pizza = new Pizza();
        CarrinhoDeCompras carinho = new CarrinhoDeCompras();

        carinho.adicionarPizza(pizza);

        assertEquals(0, carinho.getPrecoTotal());
    }

    @Test
    public void testeSomaPrecoCarrinho1(){
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();

        pizza1.adicionaIngrediente("peperoni");
        pizza1.adicionaIngrediente("muzzarela");

        pizza2.adicionaIngrediente("frango");
        pizza2.adicionaIngrediente("catupiry");
        pizza2.adicionaIngrediente("milho");

        pizza3.adicionaIngrediente("presunto");
        pizza3.adicionaIngrediente("milho");
        pizza3.adicionaIngrediente("ervilha");
        pizza3.adicionaIngrediente("ovo cozido");
        pizza3.adicionaIngrediente("muzzarela");
        pizza3.adicionaIngrediente("cebola");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarPizza(pizza1);
        carrinho.adicionarPizza(pizza2);
        carrinho.adicionarPizza(pizza3);

        assertEquals(58, carrinho.getPrecoTotal());
    }

    @Test
    public void testeSomaPrecoCarrinho2(){
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();

        pizza1.adicionaIngrediente("peperoni");
        pizza1.adicionaIngrediente("muzzarela");

        pizza2.adicionaIngrediente("frango");
        pizza2.adicionaIngrediente("catupiry");
        pizza2.adicionaIngrediente("milho");

        pizza3.adicionaIngrediente("presunto");
        pizza3.adicionaIngrediente("milho");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarPizza(pizza1);
        carrinho.adicionarPizza(pizza2);
        carrinho.adicionarPizza(pizza3);

        assertEquals(50, carrinho.getPrecoTotal());
    }
}
