package bit_manipulation;
import java.util.*;
public class OppositeSign {
	static boolean isoppositesign(int num1,int num2) {
		return ((num1^num2)<0);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	if(isoppositesign(n1,n2)==true) {
		System.out.println("true");
	}
		else {
			System.out.println("false");
		}
	}
}

