package com.j2.mydecorator;
public abstract class Bingsu {
	String description = "Unknown Bingsu";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}