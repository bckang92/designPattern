package com.j2.myAbstractFactory;

public abstract class Circle {
		String name;
	    Color color;
	    Shadow shadow;
	  
	    abstract void prepare();
	    void cut() {
	        System.out.println("Cutting the Circle by machine");
	    }
	    void box() {
	        System.out.println("Place Circle in official box");
	    }
	    void setName(String name) {
	        this.name = name;
	    }
	    String getName() {
	        return name;
	    }
	    public String toString() {
	        StringBuffer result = new StringBuffer();
	        result.append("---- " + name + " ----\n");
	        if (color != null) {
	            result.append(color);
	            result.append("\n");
	        }
	        if (shadow != null) {
	            result.append(shadow);
	            result.append("\n");
	        }
	     
	        return result.toString();
	    }
}
