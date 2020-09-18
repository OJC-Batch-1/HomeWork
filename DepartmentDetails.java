package classobject;
import java.util.*;
class DepartmentDetails {
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		Department d=new Department();
		s.clg();
		System.out.println("Enter the department id:");
		d.did=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the department name:");
		d.dname=sc.nextLine();
		System.out.println("Enter the student id:");
		s.sid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the student name:");
		s.sname=sc.nextLine();
		System.out.println("Enter the student age:");
		s.age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the student gender:");
		s.gender=sc.nextLine();
		s.clg();
		s.depatment = d;
		s.getStudentdetails();


	}
}
 class Student{
	int sid;
	String sname;
	int age;
	String gender;
	 static String clgname;	
	Department depatment;
	public void getStudentdetails() {
		depatment.display();
		System.out.println("Student Id:"+sid);
		System.out.println("Student Name:"+sname);
		System.out.println("Student age:"+age);
		System.out.println("Student gender:"+gender);
		
	}
	static void clg() {
		clgname="Gaya college";
		System.out.println("College Name:"+clgname);
	}
	
}
 class Department{
	
	int did;
	 String dname;
	 public void display() {
		 System.out.println("Department Id:"+did);
		 System.out.println("Department Name:"+dname);
	 }
 }