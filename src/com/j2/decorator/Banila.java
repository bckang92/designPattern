package com.j2.decorator;
public class Banila extends CondimentDecorator {
	//Beverage beverage;
 
	public Banila(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", banila";
	}
 
	public double cost() {
		return .15 + beverage.cost();
	}
}