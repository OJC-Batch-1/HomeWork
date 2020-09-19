package com.onlinejava;

import java.util.Scanner;

public class BitManipulationOnAlphabet {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		upperToLower();
		lowerToUpper();
		positionOfUpperCase();

	}

	private static void upperToLower() {
		System.out.println("UpperCase To LowerCase...");
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch + " -> " + (char) (ch ^ 32));
		}
	}

	private static void lowerToUpper() {
		System.out.println("LowerCase To UpperCase...");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + " -> " + (char) (ch ^ 32));
		}
	}

	private static void positionOfUpperCase() {
		System.out.print("Enter a character in uppercase : ");
		char ch = sc.next().charAt(0);
		System.out.println(ch + " -> " + (ch ^ 64));
	}

}
