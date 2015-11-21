package com.j2.templatemethod.barista;
import java.io.*;
public abstract class CaffeinBeverageWithHook{
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    if(customerWantsCondiments()){
      addCondiments();
    }
    
  }  
  abstract void brew();
  abstract void addCondiments();
  void boilWater(){
    System.out.println("Boiling water");
  }
  void pourInCup(){
    System.out.println("Pour In Cup");
  }
  boolean customerWantsCondiments(){
    return true;
  }
}