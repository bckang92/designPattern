package com.j2.mydecorator;
public class ChocolateSyrup extends CondimentDecorator {

 
	public ChocolateSyrup(Bingsu bingsu) {
		this.bingsu = bingsu;
	}
 
	public String getDescription() {
		return bingsu.getDescription() + ", ChocolateSyrup";
	}
 
	public double cost() {
		return 1.5 + bingsu.cost();
	}
}