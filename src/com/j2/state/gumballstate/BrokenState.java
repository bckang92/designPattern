package com.j2.state.gumballstate;
public class BrokenState implements State {
	  GumballMachine gumballMachine;
	  
	    public BrokenState(GumballMachine gumballMachine) {
	        this.gumballMachine = gumballMachine;
	    }
	 
	 public void insertQuarter() {
	  System.out.println("You can't insert a quarter, the machine is broken down.call this number xxx-xxxx");
	 }
	 
	 public void ejectQuarter() {
	  System.out.println("You can't eject, the machine is broken. call this number xxx-xxxx");
	 }
	 
	 public void turnCrank() {
	  System.out.println("You can't turn the crank , the machine is broken down.call this number xxx-xxxx");
	 }
	 
	 public void dispense() {
	  System.out.println("call this number xxx-xxxx");
	 }
	 
	 public String toString() {
	  return "broken down";
	 }
}
