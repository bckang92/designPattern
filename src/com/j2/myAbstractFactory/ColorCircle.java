package com.j2.myAbstractFactory;


public class ColorCircle extends Circle {
    CircleIngredientFactory ingredientFactory;
 
    public ColorCircle(CircleIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.println("Preparing " + name);
        color = ingredientFactory.createColor();
        shadow = ingredientFactory.createShadow();
    }
}