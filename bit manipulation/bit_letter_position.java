import java.util.*;
public class bit_letter_position
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any uppercase character:");
        char c = sc.next().charAt(0);
        int x = 64;
        int pos = ((int)c)^x;
        System.out.println(pos);
    }
}