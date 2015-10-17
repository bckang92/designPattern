package com.j2.myAbstractFactory;

public class CircleTestDrive {
	 public static void main(String[] args) {
	        CircleMaker ThreeDMaker = new ThreeDCircleMaker();
	        CircleMaker TwoDMaker = new TwoDCircleMaker();
	        Circle circle = ThreeDMaker.orderCircle("shadow");
	        System.out.println("Ethan ordered a " + circle + "\n");
	 
	        circle = TwoDMaker.orderCircle("shadow");
	        System.out.println("joy ordered a"+circle+"\n");
	    
	        circle = TwoDMaker.orderCircle("color");
	        System.out.println("Kang ordered a"+circle+"\n");
	    
	        
	        circle = ThreeDMaker.orderCircle("color");
	        System.out.println("Park ordered a " + circle + "\n");
	    }
}
