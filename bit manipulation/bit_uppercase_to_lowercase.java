import java.util.*;
public class bit_uppercase_to_lowercase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any uppercase character code between 65 to 90:");
        int a = sc.nextInt();
        int x = 32;
        int r = (a|x);
        System.out.println(((char)a)+" -> "+((char)r));
        
    }
}