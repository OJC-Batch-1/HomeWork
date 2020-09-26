import java.util.Scanner;
public class Area_Perimeter_Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Rectangle obj=new Rectangle();
		System.out.println("Area = "+obj.Area(a,b));
		System.out.println("Perimeter = "+obj.getParameter(a,b));
	}

}

class Rectangle {

	public int Area(int a,int b)	{
		return a*b;
	}
	public int getParameter(int l,int b)	{
		return 2*(l+b);
	}
}
