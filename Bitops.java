import java.util.*;

class Bitops{
    public static void main(String []args){

        Scanner sc=new Scanner(System.in);

        // // 1. check if given interger is even or odd
        System.out.println("enter the number :");
        int n=sc.nextInt();
        
        if((n^1)==n+1)
           System.out.print("even");
        
        
        else
            System.out.print("odd");
        
        
        // // 2.  Detect if two integer have opposite sign or not 
        System.out.println("Enter two number :");
        int x=sc.nextInt();
        int y=sc.nextInt();

        if((x^y)<0)
            System.out.println("both number have opposite sign ");
        else
            System.out.println("both number have same sign");

        
        // 3. add one to given integer

        int m=1;
        while((n&m)>=1){
            n=n^m;
            m<<=1;
            
        }
        n=n^m;
        System.out.println(n);

        // 4. swap two number without using two varaible

        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("x = " + x + "  y = " + y);


        // 5. convert uppercase character to lowercase and vice versa

        System.out.println("Enter the characters :");    
        char a =sc.next().charAt(0);

        
            a^=32;
        
        System.out.println(a);

        // 7. find the position of uppercase Alphabets

        int NUM=31;

        System.out.println(a&NUM);


    }
}
