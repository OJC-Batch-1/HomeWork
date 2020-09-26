package ClassProgram;

import java.util.Scanner;

public class Complex {

	int real, imaginary;

	public Complex(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public Complex() {}

	private void getSum(Complex c1, Complex c2) {
		int r = c1.real + c2.real;
		int i = c1.imaginary + c2.imaginary;
		System.out.println("Sum : " + r + " + " + i + "i");
	}

	private void getProduct(Complex c1, Complex c2) {
		int r = ((c1.real * c2.real) - (c1.imaginary * c2.imaginary));
		int i = ((c1.imaginary * c2.real) + (c1.real * c2.imaginary));
		System.out.println("product : " + r + " + " + i + "i");

	}

	private void getDifference(Complex c1, Complex c2) {
		int r = c1.real - c2.real;
		int i = c1.imaginary - c2.imaginary;
		System.out.println("Difference : " + r + " + " + i + "i");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Complex c1 = new Complex();
		System.out.print("Enter real and imaginary part of 1st number : ");
		c1.real = sc.nextInt();
		c1.imaginary = sc.nextInt();

		Complex c2 = new Complex();
		System.out.print("Enter real and imaginary part of 2nd number : ");
		c2.real = sc.nextInt();
		c2.imaginary = sc.nextInt();

		Complex c = new Complex();

		c.getSum(c1, c2);
		c.getDifference(c1, c2);
		c.getProduct(c1, c2);

	}

}
