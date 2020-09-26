import java.util.*;
import java.lang.Math;

public class Area_Perimeter_Triangle {

	public static void main(String[] args) {
		Triangle obj=new Triangle();
		obj.getInput();
		obj.calculate();
	}
}

 class Triangle {
	int a,b,c;
	public void getInput() {
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	}
	
	public void calculate()	{
		double s=(a+b+c)/2;
		double area=Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
		int perimeter=a+b+c;
		System.out.println("Area of Triangle : "+area);
		System.out.println("Perimeter of Triangle : "+perimeter);
	}
	
}