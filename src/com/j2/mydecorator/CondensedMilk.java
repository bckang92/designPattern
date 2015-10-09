package com.j2.mydecorator;

public class CondensedMilk extends CondimentDecorator {
	
	public CondensedMilk(Bingsu bingsu) {
		this.bingsu = bingsu;
	}
 
	public String getDescription() {
		return bingsu.getDescription() + ", CondensedMilk";
	}
 
	public double cost() {
		return 2.0 + bingsu.cost();
	}
}