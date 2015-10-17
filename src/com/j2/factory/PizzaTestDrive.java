package com.j2.factory;


public class PizzaTestDrive {
	 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza1 = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza1.getName() + "\n");
		Pizza pizza2 = store.orderPizza("Potato");
		System.out.println("We ordered a " + pizza2.getName() + "\n");
 
	}
}