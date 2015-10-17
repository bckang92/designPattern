package com.j2.myAbstractFactory;

public abstract class CircleMaker {
	protected abstract Circle createCircle(String item);
	 
    public Circle orderCircle(String type) {
        Circle circle = createCircle(type);
        System.out.println("--- Making a " + circle.getName() + " ---");
        circle.prepare();
        circle.cut();
        circle.box();
        return circle;
    }
}
