// Area & Perimeter of Triangle

class Triangle{
	static void area(int a,int b,int c){
	 float s=(a+b+c)/2;
	 int perimeter=a+b+c;
	 System.out.println("perimeter of triangle="+perimeter);
	 System.out.println("area="+ (float)Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
 public static void main(String arg[]){
	area(3,4,5);
   }
 }
 
 // Movie design(title,studio,rating)
 
 import java.util.*;
public class Movie{
	private String title;
	private String studio;
	private String rating;
	/*.......part (a).......*/
	Movie(String title,String studio,String rating){
		this.title=title;
		this.studio=studio;
		this.rating=rating;
	}
	public void getMovieDetails(){
		System.out.println("title of Movie="+title +" , studio of Movie="+studio +" ,  rating of Movie="+rating);
	}
	/*.......part (b).......*/
	Movie(String title,String studio){
		String rating="PG";
		this.title=title;
		this.studio=studio;
		System.out.print("rating of movie="+rating);
	}
	public void getdetails(){
		System.out.println(", title of movie="+title +", studio of movie="+studio);
	}
	/*.......part(d).......*/
	Movie(){
		String title="Eon Productions";
		String studio="Casino Royale";
		String rating="PG13";
	System.out.println("title of movie="+title +", studio of movie="+studio +", rating of movie="+rating);
	}
	/*.......part(c).......*/
	public Movie[] getPG(Movie[] mov){
		Movie[] newMovie=new Movie[mov.length];
		int count=0;
		for(int i=0;i<mov.length;i++){
			Movie m=mov[i];
			if(m.rating=="PG"){
				newMovie[count]=m;
				count++;
			}
		}
		Movie[] newMov=new Movie[count];
			for(int i=0;i<count;i++){
				newMov[i]=newMovie[i];
				}
				return newMov;
			}
public static void main(String arg[]){
	Movie film=new Movie("Dastak","Fox studio","PG13");
	film.getMovieDetails();
	Movie film1=new Movie("Mission Kashmir","Warner Bros");
	film1.getdetails();
	Movie m1=new Movie("sole","fox studio","PG");
	Movie m2=new Movie("dhadkan","T-series");
	Movie m3=new Movie("Eon Productions","Casino Royale","PG");
	Movie m4=new Movie("baghban","fox studio","PG5");
	Movie m5=new Movie("3 Idiots","fox studio","PG");
	Movie[] movies={m1,m2,m3,m4,m5};
	Movie[] newMovies=m1.getPG(movies);
	for(int i=0; i<newMovies.length; i++) {
			System.out.print(newMovies[i].title + " ");
			System.out.print(newMovies[i].studio + " ");
			System.out.print(newMovies[i].rating);
			System.out.println();
	    }
	}
}

// Area & Perimeter of Rectangle

class Shape{
	public static void main(String arg[]){
		Rectangle r1=new Rectangle(6,5);
		}
	}
class Rectangle{
	int a,b;
	public Rectangle(int a, int b){
		this.a=a;
		this.b=b;
	System.out.println(area());	
	System.out.println(getparameter());
		}
	public int area(){
		return a*b;
	}
	public int getparameter(){
		return 2*(a+b);
	}
 }
	// Complex no. (sum,diffrence,product)
  
  import java.util.Scanner;
class CalculationNumComplex{
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter real part of number ");
	int real=sc.nextInt();
	int real1=sc.nextInt();
	System.out.println("enter imaginary part of number ");
	int imaginary=sc.nextInt();
	int imaginary1=sc.nextInt();
	Complex obj=new Complex(real,imaginary,real1,imaginary1);
	obj.sum();
	obj.difference();
	obj.product();
	}
   }
class Complex{
	int real,real1,real2,i;
	int imaginary,imaginary1,imaginary2;
	public Complex(int real1,int imaginary1,int real2,int imaginary2 ){
		this.real1=real1;
		this.imaginary1=imaginary1;
		this.real2=real2;
		this.imaginary2=imaginary2;
	}
	public void sum(){
		int real=real1+real2;
		int imaginary=imaginary1+imaginary2;
		System.out.println(real + "+" + imaginary + "i");
	}
	
	public void difference(){
		int real=real1-real2;
		int imaginary=imaginary1-imaginary2;
		System.out.println(real + "+" + imaginary + "i");
	}
	public void product(){
		int real=(real1*real2)-(imaginary1*imaginary2);
		int imaginary=(real1*imaginary2)+(imaginary1*real2);
		System.out.println(real + "-" + imaginary + "i");
	}
  }
	
  // Employee detail 
  
  class Emp{
	public static void main(String arg[]){
		System.out.println("Name" + "\t" + "Year of joining" + "\t\t" + "Address" + "\t\t\t" + "Salary");
		Employee obj1=new Employee("Robert","1994","64C- WallsStreat",20000);
		Employee obj2=new Employee("Sam","2000","68D- WallsStreat",30000);
		Employee obj3=new Employee("John","1999"," 26B- WallsStreat",50000);
		obj1.display();
		obj2.display();
		obj3.display();
		}
	}
class Employee{
	String name,yoj,address;
	long salary;
	public Employee(String name,String yoj,String address,long salary){
		this.name=name;
		this.yoj=yoj;
		this.address=address;
		this.salary=salary;
	}
	public void display(){
	    
		System.out.println(name + "\t" + yoj + "\t\t\t" + address + "\t" + salary);
	}
 }
 
	
  
