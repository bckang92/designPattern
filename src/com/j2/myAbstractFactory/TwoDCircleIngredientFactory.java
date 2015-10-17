package com.j2.myAbstractFactory;

public class TwoDCircleIngredientFactory implements CircleIngredientFactory {
	 public Color createColor() {
	        return new BlueColor();
	    }
	    public Shadow createShadow() {
	        return new NoShadow();
	    }
}
