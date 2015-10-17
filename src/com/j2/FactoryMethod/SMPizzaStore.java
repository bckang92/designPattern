package com.j2.FactoryMethod;

public class SMPizzaStore extends PizzaStore {
 Pizza createPizza(String item) {
  if (item.equals("Potato")) {
   return new SMStylePotatoPizza();

  } else return null;
 }
}