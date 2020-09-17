package Bit_Manipulation;

import java.util.Scanner;

public class add1 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		n=sc.nextInt();
		System.out.println("After adding 1: "+(-(~n)));

	}

}
