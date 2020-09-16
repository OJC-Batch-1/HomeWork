package bit_manipulation;
import java.util.*;
public class Swap_Bitwiswxor {
	static void swap(int n1,int n2) {
		n1=n1^n2;
		n2=n1^n2;
		n1=n1^n2;
		System.out.println("After swapping:");
		System.out.println("First number:"+n1);
		System.out.println("Second number:"+n2);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
	int num1=sc.nextInt();
	System.out.println("Enter second number:");
	int num2=sc.nextInt();
	swap(num1,num2);
}
}
