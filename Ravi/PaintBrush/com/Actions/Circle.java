package com.Actions;

public class Circle {
	private double radius;
	final double pi  = 3.14;
	Circle(double radius){
		this.radius = radius;
	}
	double getRadius() {
		return radius;
	}
	void draw() {
		System.out.println(" Drawing Circle ");
	}
	void area() {
		System.out.println("Area of the circle with radius "+radius+" unit is "+ (pi * radius * radius )+ " unit sq.");
	}
}
