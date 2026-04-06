package org.example.Builder;

import java.util.Map;

public class PizzaBuilder implements Builder{
    private Map<String, Boolean> ingredients;

     public PizzaBuilder(){
        ingredients.put("dough", false);
        ingredients.put("sause", false);
        ingredients.put("cheese", false);
        ingredients.put("basil", false);
    }

    public Pizza build(){
        return new Pizza(ingredients);
    }

    @Override
    public void addDough() {
        this.ingredients.put("dough", true);
    }

    @Override
    public void addSause() {
        this.ingredients.put("sause", true);
    }

    @Override
    public void addCheese() {
        this.ingredients.put("cheese", true);
    }

    @Override
    public void addBasil() {
        this.ingredients.put("basil", true);
    }
}
