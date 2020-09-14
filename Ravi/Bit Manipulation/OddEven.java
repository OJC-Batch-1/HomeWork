import java.util.Scanner;
class OddEven {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      if(n>0){
         if((n & 1) == 001)
            System.out.println("Odd");
         else
            System.out.println("Even");
      }
      else
         System.out.println("Invalid input");
   //System.out.println(n&1);
      sc.close();
   }
}













