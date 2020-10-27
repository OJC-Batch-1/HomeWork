package com.design;

public class Circle implements Shape {

	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	public void getArea() {
		double area = (double) (Math.PI * radius * radius);
		System.out.printf(String.format("Area of Circle : %.2f\n", area));
	}

	@Override
	public void fillColour() {
		System.out.println("Colouring Circle as red.\n");
	}

}
