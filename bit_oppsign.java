import java.util.*;
public class bit_oppsign
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a^b)<0){
            System.out.println("opposite sign");
        }
        else{
            System.out.println("same sign");
        }
    }
}