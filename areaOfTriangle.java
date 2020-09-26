package test;

public class areaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
triangle t =new triangle(4,4,5);
t.getarea();
t.getperimeter();
	}

}
class triangle{
	int a;
	int b;
	int c;
	
	public triangle(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void getarea() {
		double s=(a+b+c)/2;
		double A = s*(s-a)*(s-b)*(s-c);
		System.out.print("Area of triangle is "+Math.sqrt(A));
	}
	public void getperimeter() {
		int perimeter = a+b+c;
		System.out.print("Perimeter of triangle is "+perimeter);
	}
}