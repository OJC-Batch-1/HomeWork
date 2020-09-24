public class employee
{
    public static void main(String[] args)
    {
        Employee1 e1 = new Employee1("Robert",1994,"64C-WallsStreat");
        Employee1 e2 = new Employee1("Sam",2000,"68D-WallsStreat");
        Employee1 e3 = new Employee1("John",1999,"26B-WallsStreat");
        System.out.println("Name\tYear of joining\tAddress");
        e1.getEmployeeDetail();
        e2.getEmployeeDetail();
        e3.getEmployeeDetail();

    }
}
class Employee1{
    String name;
    int yoj;
    String address;

    public Employee1(String name, int yoj, String address){
        this.name = name;
        this.yoj = yoj;
        this.address = address;
    }
    public void getEmployeeDetail(){
        System.out.println(name+"\t"+yoj+"\t\t"+address);
    }

    
}