package com.j2.command.homework;

public class DVD {
  int level;
  String location;
  public DVD(String location) {
    this.location = location;
  }
  public void on() {
    level = 100;
    System.out.println("DVD is on");
  }
  public void off() {
    level = 0;
    System.out.println("DVD is off");
  }
  public void signal(int level) {
    this.level = level;
    if(level==0) {
      off();
    }
    else {
      System.out.println("DVD is on ("+level+")");
    }
  }
  public int getLevel() { return level; }
}