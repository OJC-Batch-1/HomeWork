package com.design;

public class Rectangle implements Shape {

	int length, breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}

	@Override
	public void getArea() {
		int area = length * breadth;
		System.out.println("Area of Rectangle : " + area);
	}

	@Override
	public void fillColour() {
		System.out.println("Colouring Rectangle as Yellow\n");
	}

}