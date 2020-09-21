//Print the sum, difference and product of two complex numbers 
//by creating a class named 'Complex' with separate methods for each operation 
//whose real and imaginary parts are entered by the user.
import java.util.Scanner;

class ComplexNum {
   float r,i;
   ComplexNum(Scanner sc,int i){
      System.out.print("Enter real part for num "+i+" : ");
      this.r = sc.nextFloat();
      System.out.print("Enter imaginary part for num "+i+" : ");
      this.i = sc.nextFloat(); 
   }
   void getSum(ComplexNum x){
      float real = this.r + x.r ;
      float im = this.i + x.i;
      printRes("Addition", real, im);
   }
   void getDiff(ComplexNum x){
      float real = this.r - x.r ;
      float im = this.i - x.i;
      printRes("Difference", real, im);
   }
   void getProduct(ComplexNum x){
      float real = (this.r*x.r) - (this.i*x.i);
      float im = (this.r*x.i) + (this.i*x.r);
      printRes("Product", real, im);
   }
   void printRes(String s,float a, float b){
      if(b>0)
         System.out.println(s+" : "+a+" + i "+b);
      else
         System.out.println(s+" : "+a+" - i "+Math.abs(b));
   }
}
class Prog4 {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("*** Operations on 2 complex numbers ***");
      System.out.println();
      ComplexNum c1 = new ComplexNum(sc,1);
      ComplexNum c2 = new ComplexNum(sc,2);
      System.out.println();   c1.getSum(c2);
      System.out.println();   c1.getDiff(c2);
      System.out.println();   c1.getProduct(c2);
      sc.close();
   }
}