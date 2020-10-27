

public class Rectangle {
	static int Area(int a, int b)
	{
		int area=a*b;
		return area;
	}
	static int Perimeter(int a, int b) {
		int perimeter = 2*(a+b);
		return perimeter;
	}
	public static void main(String[] args) {
		int a= 5;
		int b=4;
		System.out.println("Area :"+Area(a,b));
		System.out.println("Perimeter :"+Perimeter(a,b));
		
	}
	

}
