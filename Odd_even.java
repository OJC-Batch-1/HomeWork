package Bit_Manipulation;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		String result=(n&1)==1?"Odd":"Even";
		System.out.println(result);

	}

}
