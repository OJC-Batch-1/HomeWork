import java.util.*;
public class complex_no
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real parts:");
        int a = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter imaginary parts:");
        int b = sc.nextInt();
        int d = sc.nextInt();
        Complex comp = new Complex(a,b,c,d);
        comp.getSum();
        comp.getDifference();
        comp.getProduct();
    }
}
class Complex{
    int a,b,c,d;
    public Complex(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public void getSum(){
        int sum_real = a+c;
        int sum_im = b+d;
        System.out.println("Sum = "+sum_real+"+"+sum_im+"j");
    }
    public void getDifference(){
        int diff_real = a-c;
        int diff_im = b-d;
        System.out.println("Difference = "+diff_real+"+"+diff_im+"j");
    }
    public void getProduct(){
        int p_real = (a*c)-(b*d);
        int p_im = (a*d)+(b*c);
        System.out.println("Product = "+p_real+"+"+p_im+"j");
    }
}