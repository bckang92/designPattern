package com.j2.singleton.homework2;
public class PrintMain {
  public static void main(String[] args) {
    
    PrintSpooler spooler1=PrintSpooler.getSpooler();
    PrintSpooler spooler2=PrintSpooler.getSpooler();
    PrintSpooler spooler3=PrintSpooler.getSpooler();
  }
}
        
        