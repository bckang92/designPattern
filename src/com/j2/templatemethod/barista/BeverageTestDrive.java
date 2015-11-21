package com.j2.templatemethod.barista;
import java.io.*;
public  class BeverageTestDrive{
  public static void main(String args[]){
    CoffeeWithHook coffee = new CoffeeWithHook();
    coffee.prepareRecipe();
    Tea tea = new Tea();
    tea.prepareRecipe();
    Caramelmacciato  caramel = new Caramelmacciato();
    caramel.prepareRecipe();
  }
}