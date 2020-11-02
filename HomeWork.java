package practicesheet;

class Employee implements Cloneable{
    private int id;
    private String name;
    private int age;
    private String designation;
    private double salary;
    private Address address;
    
    private Account acc;
    
    
    public Employee(int id,String name,int age,String designation,double salary,Address address,Account acc) {
    	this.id=id;
    	this.name=name;
    	this.designation=designation;
    	this.salary=salary;
    	this.address=address;
    	this.acc=acc;
    	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
    
    public Address(String firstLine,String secondLine,int zipCode,String state) {
    	this.firstLine=firstLine;
    	this.secondLine=secondLine;
    	this.zipCode=zipCode;
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
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}

class Account{
    private String bankName;
    private long accNo;
    private String accType;    //Saving, Salary, current
    
    public Account(String bankName,long accNo,String accType) {
    	this.bankName=bankName;
    	this.accNo=accNo;
    }
    
    public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	 
}

public class HomeWork {

    public static void main(String[] args)throws CloneNotSupportedException {
    	Address a1=new Address("Manpur","Gaya",823003,"Bihar");
    	Address a2=new Address("AP Coloby","Gaya",823001,"Bihar");
    	Account ac1=new Account("PNB",740001246598L,"Salary");
    	Account ac2=new Account("SBI",647966546544L,"Salary");
    	Employee e1=new Employee(101,"Sunil",27,"Sales Manager",40000,a1,ac1);
    	Employee e2=new Employee(102,"Suresh",28,"Product Manager",45000,a2,ac2);
    	if (e1.equals(e2)) {
    		System.out.println("Same");
    	}
    	else
    		System.out.println("not same");
    	
    	
    	if(e1.getAddress().equals(e2.getAddress())) {
    		System.out.println("Same");
    	}
    	else
    		System.out.println("Not Same");
    	
    	Employee e3 = (Employee) e1.clone();
		e3.setName("Rajiv");

		if (e1.getAddress().equals(e3.getAddress()))
			System.out.println("Sunil and Rajiv are staying in same flat");

		Employee e4 = (Employee) e2.clone();
		e4.setName("Ajay");

		System.out.println("Details comprision between Ajay, Sunil and Rajiv = " +e4.getAddress().equals(e1.getAddress()));
    	
    	
    	
    	
    } 

}

	


