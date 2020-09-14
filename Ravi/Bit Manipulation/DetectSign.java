import java.util.*;

class DetectSign {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter two numbers : ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      if((a ^ b) < 0)
         System.out.println("Numbers are having opposite signs.");
      else
         System.out.println("Numbers are having similar sign.");
      sc.close();
   }   
}
