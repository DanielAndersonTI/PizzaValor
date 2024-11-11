# PizzaValor

Este projeto simula um sistema de carrinho de compras para pizzas. Ele permite adicionar pizzas com diferentes ingredientes, calcular o preço de cada pizza com base na quantidade de ingredientes, e registrar a quantidade total de cada ingrediente usado nas pizzas. O sistema também fornece um carrinho de compras que armazena as pizzas adicionadas e calcula o preço total.

## Funcionalidades

- **Adicionar Ingredientes nas Pizzas**: O sistema permite que você adicione ingredientes nas pizzas e automaticamente atualiza o preço.
- **Cálculo de Preço**: O preço das pizzas é calculado com base no número de ingredientes:
  - Menos de 3 ingredientes: R$ 15
  - Entre 3 e 5 ingredientes: R$ 20
  - 6 ou mais ingredientes: R$ 23
- **Carrinho de Compras**: Pizzas podem ser adicionadas a um carrinho de compras. O sistema calcula o preço total das pizzas no carrinho.
- **Contabilização de Ingredientes**: O sistema mantém um controle de todos os ingredientes usados em todas as pizzas, com a contagem de quantas vezes cada ingrediente foi utilizado.

## Como Funciona

1. **Criar Pizzas e Adicionar Ingredientes**
   - Você pode criar objetos `Pizza` e adicionar ingredientes à pizza com o método `adicionaIngrediente(String ingrediente)`.

2. **Adicionar Pizzas ao Carrinho**
   - O carrinho de compras pode ser acessado por meio da classe `CarrinhoDeCompras`. Use o método `adicionarPizza(Pizza pizza)` para adicionar pizzas ao carrinho.
   
3. **Ver o Total de Pizzas e Preço**
   - O total de pizzas no carrinho pode ser verificado usando `CarrinhoDeCompras.getTotalPizzas()`.
   - O preço total das pizzas no carrinho pode ser verificado com `CarrinhoDeCompras.getPrecoTotal()`.

4. **Contabilizar Ingredientes Usados**
   - O sistema mantém um controle de quantas vezes cada ingrediente foi utilizado em todas as pizzas criadas. Você pode acessar esse controle usando `Pizza.getIngredientesTotal()`.

## Exemplo de Uso

```java
package com.PizzaValor;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando um carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        // Criando pizzas
        Pizza peperoni = new Pizza();
        Pizza frango = new Pizza();
        Pizza portuguesa = new Pizza();

        // Adicionando ingredientes às pizzas
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
        
        // Adicionando pizzas ao carrinho
        carrinho.adicionarPizza(peperoni);
        carrinho.adicionarPizza(frango);
        carrinho.adicionarPizza(portuguesa);

        // Imprimindo informações do carrinho
        carrinho.imprimir();
        
        // Imprimindo ingredientes totais usados
        System.out.println("Ingredientes utilizados:");
        System.out.println(Pizza.getIngredientesTotal());
    }
}

