package test;

public class areaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r=new Rectangle (4,5);
System.out.print("area="+r.getarea()+"\nperimeter="+r.getperimeter());
	}

}
class Rectangle {
	int a;
	int b;
	public Rectangle(int a,int b) {
		this.a=a;
		this.b=b;
		
	}
	public int getarea() {
		return a*b;
	}
	public int getperimeter() {
		return 2*(a+b);
	}
}