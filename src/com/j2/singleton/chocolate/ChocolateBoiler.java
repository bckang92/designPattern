package com.j2.singleton.chocolate;

public class ChocolateBoiler{
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled = 0;
  private boolean empty;
   private boolean boiled;
    
  private ChocolateBoiler(){}
  public static ChocolateBoiler getInstance(){
    if(uniqueInstance ==null){
      System.out.println("Creating a new Instance");
      uniqueInstance = new ChocolateBoiler();
    }
    System.out.println("NumCalled :"+ numCalled++);
    return uniqueInstance;
  }
  public void fill(){
    if(isEmpty()){
      empty = false;
      boiled = false;
    }
  }
     public boolean isEmpty(){
       return empty;
     }
}