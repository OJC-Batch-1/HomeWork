package com.Actions;

public class Line {
	private double length;
	
	Line(double length){
		this.length = length;
	}
	double getLength() {
		return length;
	}
	void draw() {
		System.out.println(" Drawing Line ");
	}
	
}
