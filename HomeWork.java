class Employee implements Cloneable{
	private int id;
	private String name;
	private int age;
	private String designation;
	private double salary;
	
	private Address address;
	private Account acc;
	
	public Employee(int id, String name, int age, String designation, double salary, Address address, Account acc) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
		this.acc = acc;

	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
}

class Address implements Cloneable{
	private String firstLine;
	private String secondLine;
	private int zipCode;
	private String state;
	
	public Address(String firstLine, String secondLine, int zipCode, String state) {
		this.firstLine=firstLine;
		this.secondLine = secondLine;
		this.zipCode = zipCode;
		this.state=state;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getFirstLine() {
		return firstLine;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}

class Account implements Cloneable{
	private String bankName;
	private long accNo;
	private String accType; //Saving, Sarary, current
	
	public Account(String bankName, long accNo, String accType) {
		this.bankName = bankName;
		this.accNo =accNo;
		this.accType=accType;

	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}


}


public class HomeWork {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address add1=new Address("Gaya","Pehani",823003,"Bihar");
		Address add2 = new Address("Durgapur","BCET", 713212, "West Bengal");
	
		Account acc1=new Account("SBI",123000768,"Saving");
		Account acc2= new Account("PNB", 156700000, "Current");
		
		Employee emp1 = new Employee(1,"Sunil",30,"Developer",750000,add1,acc1);
		Employee emp2 = new Employee(2,"Ramu", 36, "Manager", 800000, add2, acc2);

		if (emp1.equals(emp2))
			System.out.println("Primitive properties are same");
		else
			System.out.println("Primitive properties are different");

		if (emp1.getAddress() == emp2.getAddress())
			System.out.println("Address same");
		else
			System.out.println("Address different");
		
		Employee emp3 = (Employee) emp1.clone();
		emp3.setName("Rajiv");

		if (emp1.getAddress() == emp3.getAddress())
			System.out.println("Sunil and Rajiv are staying in same flat");

		Employee emp4 = (Employee) emp2.clone();
		emp4.setName("Ajay");
		
		System.out.println("comparing the address and other details of both Ajay and Sunil = " +emp4.getAddress().equals(emp1.getAddress()));
	}

}
