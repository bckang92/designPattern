package com.j2.mydecorator;
public class SolBing {
	 
	public static void main(String args[]) {
		Bingsu bingsu = new MangoBingsu();
		System.out.println(bingsu.getDescription() 
				+ " $" + bingsu.cost());
		
		Bingsu bingsu1 = new AdzukiBeanBingsu();
		System.out.println(bingsu1.getDescription() 
				+ " $" + bingsu1.cost());
		
 
		Bingsu bingsu2 = new MilkIce();
		bingsu2 = new FruitTopping(bingsu2);
		bingsu2 = new Icecream(bingsu2);
		bingsu2 = new CondensedMilk(bingsu2);
		System.out.println(bingsu2.getDescription() 
				+ " $" + bingsu2.cost());
 
		Bingsu bingsu3 = new PureIce();
		bingsu3 = new FruitTopping(bingsu3);
		bingsu3 = new Icecream(bingsu3);
		bingsu3 = new ChocolateSyrup(bingsu3);
		System.out.println(bingsu3.getDescription() 
				+ " $" + bingsu3.cost());
	}
}
