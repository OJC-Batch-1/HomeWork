package com.onlinejava;

import java.util.Scanner;

public class BitManipulation {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		BitManipulation bit = new BitManipulation();
		System.out.println(".........Given integer is even or not................");
		bit.checkEvenOrOdd();
		System.out.println("..........Detect two integer is opposite sign or not..............");
		bit.oppositeSignOrNot();
		System.out.println("...........Add one to given integer............");
		bit.addOne();
		System.out.println("...........Swap two numbers....................");
		bit.swap();

	}

	private void checkEvenOrOdd() {
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.println(((n & 1) == 0) ? "Even" : "Odd");
	}

	private void oppositeSignOrNot() {
		System.out.println("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((a ^ b) >= 0) {
			System.out.println("Given number is in Same Sign");
		} else {
			System.out.println("Given number is in Opposite Sign");
		}
	}

	private void addOne() {
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		System.out.println(-(~num));
	}

	private void swap() {
		System.out.print("Enter two number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swap\n" + "a : " + a + "   b : " + b);
	}

}
