package ClassProgram;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length and breadth of rectangle : ");
		float length = sc.nextInt();
		float breadth = sc.nextInt();

		Rectangle rect = new Rectangle();

		float area = rect.getArea(length, breadth);
		System.out.printf(String.format("Area of rectangle : %.2f\n", area));

		float perimeter = rect.getPerimeter(length, breadth);
		System.out.printf(String.format("Perimeter of rectangle : %.2f", perimeter));

	}

	private float getArea(float length, float breadth) {
		return (length * breadth);
	}

	private float getPerimeter(float length, float breadth) {
		return 2 * (length + breadth);
	}

}
