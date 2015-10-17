package com.j2.myAbstractFactory;

public class ShadowCircle extends Circle {
    CircleIngredientFactory ingredientFactory;
 
    public ShadowCircle(CircleIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.println("Preparing " + name);
        color = ingredientFactory.createColor();
        shadow = ingredientFactory.createShadow();
    }
}
