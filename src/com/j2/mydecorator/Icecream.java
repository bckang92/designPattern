package com.j2.mydecorator;
public class Icecream extends CondimentDecorator {

 
	public Icecream(Bingsu bingsu) {
		this.bingsu = bingsu;
	}
 
	public String getDescription() {
		return bingsu.getDescription() + ", Icecream";
	}
 
	public double cost() {
		return .10 + bingsu.cost();
	}
}