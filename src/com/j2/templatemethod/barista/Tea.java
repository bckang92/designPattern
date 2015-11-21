package com.j2.templatemethod.barista;
import java.io.*;
public class Tea extends CaffeinBeverageWithHook{
  public void brew(){
    System.out.println("Steep teabag");
  }
  public void addCondiments(){
    System.out.println("Adding Lemon");
  }
}