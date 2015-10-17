package com.j2.myAbstractFactory;

public class ThreeDCircleMaker extends CircleMaker {
	 protected Circle createCircle(String item) {
	        Circle circle = null;
	        CircleIngredientFactory ingredientFactory=new ThreeDCircleIngredientFactory();
	 
	        if (item.equals("shadow")) {
	  
	            circle = new ShadowCircle(ingredientFactory);
	            circle.setName("Shadowed 3D Circle");
	  
	        }
	        if(item.equals("color")){
	      	  circle = new ColorCircle(ingredientFactory);
	      	  circle.setName("Colored 3D Circle");
	      }
	        return circle;
	    }
}
