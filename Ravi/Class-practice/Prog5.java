//Write a program that would print 
//the information (name, year of joining, salary, address) 
//of three employees by creating a class named 'Employee'.
import java.util.Scanner;
class Employee{
   String name,address;
   int yoj;
   float salary;
   Employee(Scanner sc,int i){
      System.out.println();
      System.out.print("Enter name for emp "+i+" : ");
      this.name = sc.nextLine();
      System.out.print("Enter year of joining for emp "+i+" : ");
      this.yoj = sc.nextInt();
      System.out.print("Enter salary for emp "+i+" : ");
      this.salary = sc.nextFloat();
      sc.nextLine();
      System.out.print("Enter address for emp "+i+" : ");
      this.address = sc.nextLine();
   }
   void printHeader(){
      System.out.println();
      System.out.println("               EMPLOYEE DETAILS                 ");
      System.out.printf("%-20s  %s  %-6s   %-30s", "Name", "YOJ", "Salary", "Address");
      System.out.println();
      System.out.println("------------------------------------------------------------------------");
   }
   //void printRow(){
     // System.out.println(name+"\t"+yoj+"\t"+salary+"\t"+address );
   //}
   void printRow(){
      System.out.printf("%-20s  %4d  %6.2f   %-30s", this.name, this.yoj, this.salary, this.address);
      System.out.println();
   }

}
class Prog5{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("*** Print employees details in table ***");
      System.out.println();
      System.out.print("Enter number of employees to get details :");
      int n = sc.nextInt();
      sc.nextLine();
      Employee a[] = new Employee[n];
      for(int i=0; i<n; i++)
      {
         a[i] = new Employee(sc,i+1);
      }
      a[0].printHeader();
      for(int i=0; i<n; i++)
      {
         a[i].printRow();
      }
      System.out.println("------------------------------------------------------------------------");

   }
}