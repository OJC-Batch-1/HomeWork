package test;
import java.util.*;

public class complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter real numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("Enter imaginary numbers");
		int c=sc.nextInt();
		int d=sc.nextInt();
complex_no n = new complex_no(a,b,c,d);
n.getsum();
n.getdifference();
n.getproduct();
}
}
class complex_no{
	int a,b,c,d;
	public complex_no(int a, int b, int c, int d) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		}
	public void getsum() {
		int sum_real=a+c;
		int sum_ima=b+d;
		System.out.print("Sum="+sum_real+"+"+sum_ima+"j");
		
}
public void getdifference() {
	int diff_real=a-c;
	int diff_ima= b-d;
	System.out.print("Difference="+diff_real+"+"+diff_ima+"j");
	}
public void getproduct() {
	int pro_real = (a*c)-(b*d);
	int pro_ima=(a*d)+(b*c);
	System.out.print("product="+pro_real+"+"+pro_ima+"j");
}
}
