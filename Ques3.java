import java.util.Scanner;

class Rectangle{
	float a,b;
	public float area(float a,float b) {
		return a*b;
	}
	public float getPerimeter(float a,float b) {
		return 2*(a+b);
	}
}


public class Ques3 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle: ");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		System.out.printf("Area: %.2f\n",r.area(a,b));
		System.out.println("Perimeter: "+r.getPerimeter(a,b));

	}

}
