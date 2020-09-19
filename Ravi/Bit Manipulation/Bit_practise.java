import java.util.Scanner;
class Bit_practise{
   static void oddEven(Scanner sc) 
   {  System.out.println("**** CHECKING ODD OR EVEN ****");
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
      System.out.println();

   }

   static void detectSign(Scanner sc)
   { System.out.println("**** Detects sign of two numbers ****");
      System.out.print("Enter two numbers : ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      if((a ^ b) < 0)
         System.out.println("Numbers are having opposite signs.");
      else
         System.out.println("Numbers are having similar sign.");
       System.out.println();
   }
   static void addOne(Scanner sc) 
    { System.out.println("**** Add 1 to the number inserted ****");
      int m = 1; 
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
        while( (int)(n & m) >= 1) 
        { 
            n = n ^ m; 
            m <<= 1; 
        } 
        n = n ^ m; 
        System.out.println("The result is "+n); 
        System.out.println();
      }
   static void swapTwoNum(Scanner sc)
   {  System.out.println("**** Swap two numbers ****");
      System.out.print("Enter two numbers : ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("Before swap: a = "+ a + ", b = " + b);
      a = a ^ b;  
      b = a ^ b; 
      a = a ^ b;   
      System.out.println("After swap: a = "+ a + ", b = " + b);
      System.out.println();
   }

   static void strPosition(Scanner sc)
   {  System.out.println("**** Gives the position of letter ****");
      System.out.print("Enter any string: ");
      final int NUM = 31;
      String str = sc.next();
      for (int i = 0; i < str.length(); i++)
       { System.out.print(str.charAt(i)+" ");
         System.out.println((str.charAt(i) & NUM)); 
      }

      System.out.println();
   }

   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      oddEven(sc);
      detectSign(sc);
      addOne(sc);
      swapTwoNum(sc);
      strPosition(sc);
      sc.close();
   }
}













