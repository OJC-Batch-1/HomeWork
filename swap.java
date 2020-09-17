package Bit_Manipulation;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before swapping: a="+a+" b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping: a="+a+" b="+b);

	}

}
