import java.util.*;
public class bit_evenodd
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int x = sc.nextInt();
        if((x & 1) == 1)
        System.out.println("odd");
        else
        System.out.println("even");
    }
}