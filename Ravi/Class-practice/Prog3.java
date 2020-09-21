//Write a program to print the area of rectangles 
//having sides (a,b) by creating a class named 'Rectangle' 
//with a method named 'getArea' which returns the area and 
//method getParameter which returns perimeter.

import java.util.Scanner;

class Rectangle{
   float a,b;
   Rectangle(Scanner sc){
      System.out.println("Enter 2 sides for the rectangle:-");
      System.out.print("Length : ");
      this.a = sc.nextFloat();
      System.out.print("Breadth : ");
      this.b = sc.nextFloat(); 
   }
   float getPerimeter(){
      return 2*(a+b);
   }
   float getArea(){
      return a*b;
   }
}
class Prog3 {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("*** Get area and perimeter of a rectangle ***");
      Rectangle rect1 = new Rectangle(sc);
     
      System.out.println("Area of the rectangle = " +rect1.getArea()+" sq units.");
      System.out.println("Perimeter of the rectangle = " +rect1.getPerimeter()+" units.");
      System.out.println();
      sc.close();
   }
}