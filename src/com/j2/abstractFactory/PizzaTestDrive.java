package com.j2.abstractFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore smstore = new SMPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");
 
        pizza = smstore.orderPizza("cheese");
        System.out.println("joy ordered a"+pizza+"\n");
    
        pizza = smstore.orderPizza("potato");
        System.out.println("Kang ordered a"+pizza+"\n");
    
        
         pizza = nyStore.orderPizza("potato");
        System.out.println("Park ordered a " + pizza + "\n");
    }
}