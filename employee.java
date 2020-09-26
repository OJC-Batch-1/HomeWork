package test;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee1 e1= new employee1("sagar",1999,"adarsh nagar");
employee1 e2= new employee1("aman",2000,"ganesh nagar");
employee1 e3 = new employee1("darshan",2001,"vaishali nagar");
System.out.print("name\tyear\taddress");
e1.getEmployeeDetail();
e2.getEmployeeDetail();
e3.getEmployeeDetail();

	}
}
class employee1{
	String name;
	int year;
	String address;
	
	public employee1(String name,int year, String address) {
		this.name=name;
		this.year=year;
		this.address=address;
	}
	public void getEmployeeDetail() {
		System.out.print(name+"\t"+year+"\t\t"+address);
	}
}
