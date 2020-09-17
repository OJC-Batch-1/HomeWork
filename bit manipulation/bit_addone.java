import java.util.*;
public class bit_addone
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int x = sc.nextInt();
        if((x&1)==1)
        System.out.println((x|1)+1);
        else
        System.out.println(x|1);
    }
}
