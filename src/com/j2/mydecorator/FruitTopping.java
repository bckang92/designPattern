package com.j2.mydecorator;
public class FruitTopping extends CondimentDecorator {
	
 
	public FruitTopping(Bingsu bingsu) {
		this.bingsu = bingsu;
	}
 
	public String getDescription() {
		return bingsu.getDescription() + ", fruitTopping";
	}
 
	public double cost() {
		return .20 + bingsu.cost();
	}
}