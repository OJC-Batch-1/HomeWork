package Bit_Manipulation;

import java.util.Scanner;

public class Opp_or_not {

	public static void main(String[] args) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		String result=(n1>=0)^(n2<0)?"Same sign":"Opposite sign";
		System.out.println(result);
		

	}

}
