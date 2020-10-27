
public class Employee {
		String name;
		int YOJ;
		int salary;
		String address;
		
	
		
		public Employee(String name,int YOJ,int salary,String address) {
			this.name=name;
			this.YOJ=YOJ;
			this.salary=salary;
			this.address=address;
		}
		public static void main(String[]args) {
			Employee e1=new Employee("Robert",1994,30000,"64C- WallsStreat");
			Employee e2=new Employee("Sam",2000,25000,"68D- WallsStreat");
			Employee e3=new Employee("John",1999,27000,"26B- WallsStreat");
			System.out.println("Name\t\tYear of joining\t\tSalary\t\t\tAddress"); 
			System.out.println(e1.name+"\t\t"+e1.YOJ+"\t\t\t"+e1.salary+"\t\t\t"+e1.address);
			System.out.println(e2.name+"\t\t"+e2.YOJ+"\t\t\t"+e2.salary+"\t\t\t"+e2.address);
			System.out.println(e3.name+"\t\t"+e3.YOJ+"\t\t\t"+e3.salary+"\t\t\t"+e3.address);
		}
		

}
