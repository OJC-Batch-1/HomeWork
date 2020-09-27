import java.util.Scanner;

public class Ques4{ 
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real parts:");
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Enter imaginary parts:");
        int i1 = sc.nextInt();
        int i2= sc.nextInt();
        Complex c = new Complex(r1,i1,r2,i2);
        c.getSum();
        c.getDifference();
        c.getProduct();
    }
}
class Complex{
    int r1,i1,r2,i2;
    public Complex(int r1, int i1, int r2, int i2){
        this.r1 = r1;
        this.i1= i1;
        this.r2 = r2;
        this.i2 = i2;
    }
    public void getSum(){
        int sum_real = r1+r2;
        int sum_im = i1+i2;
        System.out.println("Sum = "+(sum_real)+"+"+(sum_im)+"i");
    }
    public void getDifference(){
        int diff_real = r1-r2;
        int diff_im = i1-i2;
        System.out.println("Difference = "+diff_real+"+"+diff_im+"i");
    }
    public void getProduct(){
        int p_real = (r1*r2)-(i1*i2);
        int p_im = (r1*i2)+(r2*i1);
        System.out.println("Product = "+p_real+"+"+p_im+"i");
    }
}
