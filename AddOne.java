package bit_manipulation;
import java.util.Scanner;
public class AddOne {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=1;
	System.out.println("enter a number:");
	int a=sc.nextInt();
	while ((int)(a & n) >= 1) {
		a = a ^ n;
		n <<= 1;
	}
	a= a ^ n;
	System.out.println("output after adding one:"+a);
}
}
