package com.j2.mydecorator;

public abstract class CondimentDecorator extends Bingsu {
	Bingsu bingsu;
	public abstract String getDescription();
}
