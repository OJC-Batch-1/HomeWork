
class Employee{
	private String name,address;
	private int yoj,salary;

	public Employee(String n,int yr, int sal,String add) {
		name=n;
		yoj=yr;
		salary=sal;
		address=add;
	}
	public String getName() {
		return name;
	}
	public int getYearOfJoining() {
		return yoj;
	}
	public int getSalary() {
		return salary;
	}
	public String getAddress() {
		return address;
	}
}

public class Ques5 {

	public static void main(String[] args) {
		Employee e1=new Employee("Robert",1994,20000,"64C-WallsStreet");
		Employee e2=new Employee("Sam",2000,50000,"68D-WallsStreet");
		Employee e3=new Employee("John",1999,60000,"26B-WallsStreet");
		System.out.println("Name\tYear of joining\tSalary\tAddress");
		System.out.println(e1.getName()+"\t\t"+e1.getYearOfJoining()+"\t"+e1.getSalary()+"\t"+e1.getAddress());
		System.out.println(e2.getName()+"\t\t"+e2.getYearOfJoining()+"\t"+e2.getSalary()+"\t"+e2.getAddress());
		System.out.println(e3.getName()+"\t\t"+e3.getYearOfJoining()+"\t"+e3.getSalary()+"\t"+e3.getAddress());
	}

}
