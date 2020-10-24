package com.Actions;

public class Triangle {
	private double side1,side2,side3;
	
	Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	double getSide1() {
		return side1;
	}
	double getSide2() {
		return side2;
	}
	double getSide3() {
		return side3;
	}
	void draw() {
		System.out.println(" Drawing Triangle ");
	}
	void area() {
		double semi = (side1 + side2 + side3)/2;
		double area = Math.sqrt(semi * (semi - side1) * (semi - side2) * (semi - side3));
		System.out.println("Area of the triangle with dimension "+side1+" X "+side2+" X "+side3+" unit is "+ (area )+ " usnit sq.");
	}


}


