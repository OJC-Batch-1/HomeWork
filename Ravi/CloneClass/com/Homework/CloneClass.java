package com.Homework;

public class CloneClass  {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address ad1 = new Address("Manpur Patwatoli", "Buniyadganj Gaya", "Bihar", 823003);
		Address ad2 = new Address("Madurdaha", "Hossainpur Kolkata", "West Bengal", 700103);
		
		Account ac1 = new Account("PNB,Tekari Road", "Saving",125425645 );
		Account ac2 = new Account("SBI,East Kolkata", "Salaried",721515466 );
		
		Employee e1 = new Employee("Ravi Kumar", "Student", 1854009, 22, 35486.75, ad2, ac1);
		Employee e2 = new Employee("Sumit Kumar", "Consultant", 1614035, 27, 50899, ad1, ac2);
		
		
		boolean check = e1.equals(e2);
		System.out.println(check);			//false
		System.out.println(e1 == e2);  		//false
		System.out.println("Address matching : "+ (e1.getAddress() == e2.getAddress()));	//false
		
		/* CLONING (DEEP) */
		Employee em1 = e1.clone();
		em1.setName("Sunil");
		
		Employee em2 = e1.clone();
		em2.setName("Rajiv");
		System.out.println();
		
		System.out.println("Address matching : "+ (em1.getAddress() == em2.getAddress()));
		//System.out.println("Address matching : "+ (em1.getAddress().equals(em2.getAddress())));
		
		Employee em3 = e2.clone();
		em3.setName("Ajay");
		
		}
}
