package com.j2.mydecorator;

public class MilkIce extends Bingsu {
	public MilkIce() {
		description = "MilkIce used Bingsu";
	}
 
	public double cost() {
		return 1.0;
	}
}
