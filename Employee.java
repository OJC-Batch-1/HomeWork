package ClassProgram;

public class Employee {
	
	String name;
	int joining_yr;
	double salary;
	String address;

	public Employee(String name, int joining_yr, double salary, String address) {
		this.name = name;
		this.joining_yr = joining_yr;
		this.salary = salary;
		this.address = address;
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("Robert", 1994, 50000, "64C-WallsStreat");
		Employee emp2 = new Employee("Sam", 2000, 70000, "68D-WallsStreat");
		Employee emp3 = new Employee("John", 1999, 34000, "26B-WallsStreat");
		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
		
	}
	
	private void getDetails() {
		System.out.println(name + " \t " + joining_yr + " \t  " + salary + "  \t  " + address);
	}

}
