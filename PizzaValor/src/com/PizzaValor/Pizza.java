package com.PizzaValor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pizza {
    private int totalIngredientes = 0;
    static HashMap<String, Integer> ingredientesTotal = new HashMap<>();
    private List<String> ingredientes = new ArrayList<>();

    Pizza(){
    }

    static void contabilizaIngrediente(String ingrediente){
        if(ingredientesTotal.containsKey(ingrediente))
            ingredientesTotal.replace(ingrediente,ingredientesTotal.get(ingrediente)+1);
        else
            ingredientesTotal.put(ingrediente, 1);
    }

    public void adicionaIngrediente(String ingrediente){
        totalIngredientes++;
        ingredientes.add(ingrediente);
        contabilizaIngrediente(ingrediente);
    }

    public int getPreco(){
        if(totalIngredientes<3)
            return 15;
        else if(totalIngredientes<6)
            return 20;
        else
            return 23;
    }

    public int getTotalIngredientes(){
        return totalIngredientes;
    }

    public List<String> getIngredentes(){
        return ingredientes;
    }

    public void imprimir() {
        for (int i = 0; i < totalIngredientes;) {
            System.out.print(ingredientes.get(i));
            i++;
            if(i!=totalIngredientes)
                System.out.print(", ");
            else
                System.out.println();
        }
        System.out.println("Preço: R$" + getPreco());
    }

    public static void zerar(){
        ingredientesTotal.clear();
    }

    public static HashMap<String, Integer> getIngredientesTotal() {
        return ingredientesTotal;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setTotalIngredientes(int totalIngredientes) {
        this.totalIngredientes = totalIngredientes;
    }

    public static void setIngredientesTotal(HashMap<String, Integer> ingredientesTotal) {
        Pizza.ingredientesTotal = ingredientesTotal;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
