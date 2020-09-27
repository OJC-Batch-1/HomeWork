import java.util.Scanner;

class Triangle{
	public float area(float a,float b,float c) {
		float ar;
		float s=(a+b+c)/2;
		ar=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return ar;
	}
	public float perimeter(float a,float b,float c) {
		return(a+b+c)/2;
	}
}


public class Ques1 {

	public static void main(String[] args) {
		Triangle t=new Triangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three sides of triangle: ");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		System.out.printf("Area: %.2f\n",t.area(a,b,c));
		System.out.println("Perimeter: "+t.perimeter(a,b,c));
	}

}
