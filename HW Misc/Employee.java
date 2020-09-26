public class Employee{
    String name;
    int yoj;
    // float salary;
    String address;
    public Employee(String name,int yoj,/*float salary,*/String address){
        this.name=name;
        this.yoj=yoj;
        // this.salary=salary;
        this.address=address;
    }
    public static void main(String[] args) {
        Employee e1=new Employee("Robert",1994,"64C- WallsStreat");
        Employee e2=new Employee("Sam",2000,"64D- WallsStreat");
        Employee e3=new Employee("John",1999,"26B- WallsStreat");
        System.out.printf("%-15s%-30s%-40s","Name","Year of Joining","Address");
        System.out.println();
        System.out.printf("%-15s%5s%4d%17s%-40s%n",e1.name,"",e1.yoj,"",e1.address);
        System.out.printf("%-15s%5s%4d%17s%-40s%n",e2.name,"",e2.yoj,"",e2.address);
        System.out.printf("%-15s%5s%4d%17s%-40s%n",e3.name,"",e3.yoj,"",e3.address);
    }
}