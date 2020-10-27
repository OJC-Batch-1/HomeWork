import java.util.*;

public class Holiday {
	String name;
	int day;
	String month;
	
	  
	
	public Holiday(String name,int day,String month) {
		this.name=name;
		this.day=day;
		this.month=month;
	}
	public static void main(String[]args) {
		Holiday h=new Holiday("Durga Puja",23,"October");
		Holiday h1=new Holiday("Diwali",04,"November");
		System.out.println("Holiday :"+h.name+" "+h.day+" "+h.month);
		System.out.println("Holiday :"+h1.name+" "+h1.day+" "+h1.month);
	}
	
	public boolean SameMonth(Holiday h) {
		return this.month.equals(h.month);
			
	}
	
	
	
	
	
}
