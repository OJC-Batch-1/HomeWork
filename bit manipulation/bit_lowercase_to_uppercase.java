import java.util.*;
public class bit_lowercase_to_uppercase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any lowercase character code between 97 to 122:");
        int a = sc.nextInt();
        int x = 32;
        int r = (a&(~x));
        System.out.println(((char)a)+" -> "+((char)r));
        
    }
}