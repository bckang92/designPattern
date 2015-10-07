package com.j2.decorator;
public class Americano extends Beverage {
  
	public Americano() {
		description = "Americano";
	}
  
	public double cost() {
		return 1.99;
	}
}