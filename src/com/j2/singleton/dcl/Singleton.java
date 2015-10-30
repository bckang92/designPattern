package com.j2.singleton.dcl;

public class Singleton{
  private static Singleton uniqueInstance;
  private static int numCalled = 0;
  private boolean empty;
    
  private Singleton(){}
  public volatile static Singleton getInstance(){
    if(uniqueInstance ==null){
      synchronized(Singleton.class){
        if(uniqueInstance==null){
         System.out.println("Creating a new Instance");
      uniqueInstance = new Singleton();
      }
     }
    }
    System.out.println("NumCalled :"+ numCalled++);
    return uniqueInstance;
  }
  
  }
     public boolean isEmpty(){
       return empty;
     }
}