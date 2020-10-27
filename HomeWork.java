package com.onlinejava;

public class HomeWork {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address1 = new Address("Manpur", "Gaya", 8230003, "Bihar");
		Address address2 = new Address("Fuljhor", "Durgapur", 713206, "West Bengal");

		Account acc1 = new Account("SBI", 123456789, "Saving");
		Account acc2 = new Account("PNB", 789123456, "Current");

		Employee emp1 = new Employee(1, "Sunil", 34, "HR", 40000, address1, acc1);
		Employee emp2 = new Employee(2, "Sohan", 30, "Technical Manager", 34000, address2, acc2);

		if (emp1.equals(emp2))
			System.out.println("All primitive properties of both employees are same.");
		else
			System.out.println("All primitive properties of both employees are different.");

		boolean check = emp1.getAddress() == emp2.getAddress();
		if (check)
			System.out.println("Address of both employees are same");
		else
			System.out.println("Address of both employees are different");

		Employee emp3 = (Employee) emp1.clone();
		emp3.setName("Rajiv");

		if (emp1.getAddress() == emp3.getAddress())
			System.out.println("Sunil and Rajiv are staying in same flat");

		Employee emp4 = (Employee) emp2.clone();
		emp4.setName("Ajay");
		if (emp1.getAddress() == emp4.getAddress())
			System.out.println("Address of Ajay is same");
		else
			System.out.println("Address of Ajay is different from other employees");

	}

}
