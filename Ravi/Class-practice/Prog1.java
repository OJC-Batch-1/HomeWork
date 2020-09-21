//Write a program to print the area and perimeter of a triangle 
//having sides of a, b and c units 
//by creating a class named 'Triangle'.

import java.util.Scanner;

class Triangle {
   float a,b,c;
   Triangle(Scanner sc){
      System.out.println("Enter 3 sides for the triangle:-");
      System.out.print("Length of 1st side : ");
      this.a = sc.nextFloat();
      System.out.print("Length of 2nd side : ");
      this.b = sc.nextFloat(); 
      System.out.print("Length of 3rd side : ");
      this.c = sc.nextFloat();
   }
   float getPerimeter(){
      return (a+b+c);
   }
   float getArea(){
      float s = getPerimeter()/2;
      float area =(float) Math.sqrt(s* (s-a)*(s-b)*(s-c));
      return area;
   }
}
class Prog1 {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("*** Get area and perimeter of a triangle ***");
      Triangle t1 = new Triangle(sc);
     
      System.out.println("Area of the triangle = " +t1.getArea()+" sq units.");
      System.out.println("Perimeter of the triangle = " +t1.getPerimeter()+" units.");
      sc.close();
   }
}