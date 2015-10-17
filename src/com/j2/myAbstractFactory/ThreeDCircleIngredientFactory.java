package com.j2.myAbstractFactory;

public class ThreeDCircleIngredientFactory implements CircleIngredientFactory {
	 public Color createColor() {
	        return new RedColor();
	    }
	    public Shadow createShadow() {
	        return new LongShadow();
	    }
}
