package com.Actions;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	/* ******************************* */
		System.out.println(" WELCOME TO PAINT BRUSH ");
		System.out.println();
		int choice,flag = 1;
		do {
		System.out.println("Choose what you want to do : ");
		System.out.println("\t1.Circle\n\t2.Rectangle\n\t3.Triangle\n\t4.Line");
		System.out.print("Enter your choice here : ");
		choice = sc.nextInt();
		System.out.println();
		
		switch(choice) 
		{	case 1: System.out.print("Enter value for radius  : ");
					double r = sc.nextDouble();
					Circle c = new Circle(r);
					c.draw();	c.area();	color(c,sc);
					System.out.println();
					break;
		case 2: System.out.print("Enter value for length  : ");
				double l = sc.nextDouble();
				System.out.print("Enter value for breadth  : ");
				double b = sc.nextDouble();
				Rectangle rect = new Rectangle(l,b);
				rect.draw();	rect.area();	color(rect,sc);
				System.out.println();
				break;
		case 3: System.out.print("Enter value for side 1 : ");
				double s1 = sc.nextDouble();
				System.out.print("Enter value for side 2 : ");
				double s2 = sc.nextDouble();
				System.out.print("Enter value for side 3 : ");
				double s3 = sc.nextDouble();
				Triangle tria = new Triangle(s1, s2, s3);
				tria.draw();	tria.area();	color(tria, sc);
				System.out.println();
				break;
		case 4: System.out.print("Enter value for length : ");
				double m = sc.nextDouble();
				Line lm = new Line(m);
				lm.draw();		color(lm,sc);
				System.out.println();	
				break;
		default:System.out.println("Invalid choice. \n.");	
		}
		
		System.out.println("\tType 1 for yes\n\tType 0 for No");
		System.out.print("Do you wish to continue ? : ");
		flag = sc.nextInt();
		}
		
		while(flag == 1);
		{
			System.out.println(" Thank You for using. ");
		}
		sc.close();
	}
	
	static void color (Object obj, Scanner sc) {
		System.out.println("Do you want to fill colour? If yes, then type name of colour.Else, type no. ");
		System.out.print("Response : ");
		String resp = sc.next();
		if(resp == "no")
			System.out.println("No colour has been added.");
		else
			System.out.println(resp+" color has been added in "+obj.getClass().getName());
		
	}

}
