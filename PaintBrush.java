package com.design;

import java.util.Scanner;

public class PaintBrush {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(5, 7);
		r.draw();
		r.getArea();
		r.fillColour();

		Circle c = new Circle(6);
		c.draw();
		c.getArea();
		c.fillColour();

		Triangle t = new Triangle(3, 4, 5);
		t.draw();
		t.getArea();
		t.fillColour();

		Line l = new Line();
		l.draw();
		l.getArea();
		l.fillColour();

	}

}
