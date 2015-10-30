package com.j2.singleton.homework2;

public class PrintSpooler {
  
  private static PrintSpooler spooler;
  private static int numCalled = 0;
  
  private PrintSpooler() {}
  
  public static synchronized PrintSpooler getSpooler() {
    if(spooler ==null) {
      spooler = new PrintSpooler();
      System.out.println("printSpooler turn on");
    }
    System.out.println("print spooler used :"+ numCalled++);
    return spooler;
  }
}


