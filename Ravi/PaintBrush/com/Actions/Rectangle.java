package com.Actions;

public class Rectangle {
	private double length,breadth;
	
	Rectangle(double length,double breadth){
		this.breadth = breadth;
		this.length = length;
	}
	double getLength() {
		return length;
	}
	double getBreadth() {
		return breadth;
	}
	void draw() {
		System.out.println(" Drawing Rectangle ");
	}
	void area() {
		System.out.println("Area of the rectangle with dimension "+length+" X "+breadth+" unit is "+ (length * breadth )+ " unit sq.");
	}


}
