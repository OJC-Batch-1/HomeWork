package com.design;

public class Triangle implements Shape {

	double side1, side2, side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}

	@Override
	public void getArea() {
		double s = getPerimeter(side1, side2, side3);
		double area = (double) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		System.out.println("Area of Triangle : " + area);
	}

	public static double getPerimeter(double side1, double side2, double side3) {
		return (side1 + side2 + side3) / 2;
	}

	@Override
	public void fillColour() {
		System.out.println("Colouring Triangle as Blue\n");
	}

}
