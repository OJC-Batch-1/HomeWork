import java.util.*;
class Circle{
     void draw(){
		System.out.println("drawing circle...");
	}
	public double findArea(int r){
		double area=3.14*r*r;
		return area;
	}
	void fillColor() {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter any color: ");
	  String str=sc.nextLine();
	  if(str.equals("Red") || (str.equals("red"))) {
		  System.out.println("fill red color");
	  }
	  else if(str.equals("Yellow") || str.equals("yellow")) {
		  System.out.println("fill yellow color ");
	  }
	  else {
		  System.out.println("fill black color ");
	  }
	}
  }
class Rectangle extends Shape{
 void draw(){
	System.out.println("drawing Rectangle...");
}
public double findArea(int a,int b){
	double area=a*b;
	return area;
}
void fillcolor(){
	System.out.println("fill red color");
   }
  }
class Triangle extends Shape{
 void draw(){
	System.out.println("drawing triangle...");
  }
 public double findArea(int b,int h){
    double area=0.5*b*h;
	return area;
 }
 void fillColor(){
 System.out.println("fill yellow color");
  }
 }
class Line extends Shape{
 void draw(){
	System.out.println("drawing Line...");
 }
 public int findArea(){
  return 0;
 }
 public void fillColor(){
 System.out.println("fill black color");
 }
}
class Shape{
	public static void main(String arg[]){
	 System.out.println("		 Welcome to Paint brush ");
		Circle cir=new Circle();
		cir.draw();
		System.out.println("area of circle= " +cir.findArea(7));
		cir.fillColor();
		Rectangle rec=new Rectangle();
		rec.draw();
		System.out.println("area of rectangle= " +rec.findArea(5,4));
		rec.fillcolor();
		Triangle tri=new Triangle ();
		tri.draw();
		System.out.println("area of Triangle= "+ tri.findArea(5,7));
		tri.fillColor();
		Line l=new Line();
		l.draw();
		l.findArea();
		l.fillColor();
			
		}
	}