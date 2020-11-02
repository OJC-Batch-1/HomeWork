package practicesheet;



public class Shape {
	
	public void draw() {
		System.out.println("Parent Class Called.");
	}
	public void findArea() {
		//double radius=0.0f;
		System.out.println("Parent Area Method Called.");
		//return radius;
	}
	public double findArea(double radius) {
		return (3.14*radius*radius);
	}
	public double  findArea(int l,int h) {
		return l*h;
	}
	
	
	
	
	public static void main(String[] args) {
		Circle s1=new Circle();
		Rectangle s2= new Rectangle();
		s1.draw();
		System.out.println(s1.findArea(5.5));
		s2.draw();
		double n1=s1.findArea(6,7);
		System.out.println(n1);
		Triangle s3=new Triangle();
		s3.draw();
		System.out.println(s3.findArea(7,10));
		Line s4=new Line();
		s4.draw();
		System.out.println(6);
	
		
		
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}
	public double findArea(double radius) {
		return (3.14*radius*radius);
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
	public double findArea(int length,int breadth) {
		return (length*breadth);
	}
   
}
class Triangle extends Shape{
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	public double findArea(int base,int height) {
		return (0.5*base*height);
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Drawing Line");
		
	}
	public int findArea(int length) {
		return length;
	}
}