package com.design;

public class Line implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Line");
	}

	@Override
	public void getArea() {
		System.out.println("Area of Line is not possible");
	}

	@Override
	public void fillColour() {
		System.out.println("Colouring Line as Green\n");
	}

}
