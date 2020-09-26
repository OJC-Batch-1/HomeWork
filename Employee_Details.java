
public class Employee_Details {

	public static void main(String[] args) {
		Employee obj=new Employee();
		System.out.println("Name \t Year of Joining \t Salary \t Address ");
		obj.display("Robert",2012,20000.0f,"64C_WallsStreet");
		obj.display("John",1998,20300.0f,"67D_WallsStreet");
		obj.display("Sam",2011,503480.0f,"AB_WallsStreet");
	}

}

class Employee	{
	
	
	void display(String Name,int year,float salary,String Address)	{
		
		System.out.println(Name+"\t\t"+year+"\t\t"+salary+" \t"+Address);
	}
}