package ClassProgram;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of first side : ");
		float a = sc.nextFloat();
		System.out.print("Enter length of second side : ");
		float b = sc.nextFloat();
		System.out.print("Enter length of third side : ");
		float c = sc.nextFloat();

		float area = getArea(a, b, c);
		System.out.println(String.format("Area of Triangle : %.2f", area));

		float perimeter = getPerimeter(a, b, c);
		System.out.println(String.format("Perimeter of Triangle : %.2f", perimeter));

	}

	private static float getArea(float a, float b, float c) {
		float s = getPerimeter(a, b, c) / 2;
		return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	private static float getPerimeter(float a, float b, float c) {
		return (a + b + c);
	}

}
