package com.j2.myAbstractFactory;

public class TwoDCircleMaker extends CircleMaker {
	 protected Circle createCircle(String item) {
	        Circle circle = null;
	        CircleIngredientFactory ingredientFactory=new ThreeDCircleIngredientFactory();
	 
	        if (item.equals("shadow")) {
	  
	            circle = new ShadowCircle(ingredientFactory);
	            circle.setName("Shadowed 2D Circle");
	  
	        }
	        if(item.equals("color")){
	      	  circle = new ColorCircle(ingredientFactory);
	      	  circle.setName("Colored 2D Circle");
	      }
	        return circle;
	    }
}