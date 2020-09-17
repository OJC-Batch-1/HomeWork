import java.util.*;
public class bit_swap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = (a^b);
        b = (a^b);
        a = (a^b);
        System.out.println("After swapping: a = "+a+" b = "+b);
    }
}