import java.util.Scanner;
public class ComplexNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the real numbers : ");
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        System.out.println("Enter the imaginary numbers : ");
	        int z = sc.nextInt();
	        int w = sc.nextInt();
	        Complex obj = new Complex(x,y,z,w);
	        obj.Sum();
	        obj.Difference();
	        obj.Product();
	    }
	}
class Complex{
	    int x,y,z,w;
	    public Complex(int x, int y, int z, int w){
	        this.x = x;
	        this.y = y;
	        this.z = z;
	        this.w = w;
	    }
	    public void Sum(){
	        int real = x+y;
	        int imaginary = z+w;
	        System.out.println("Sum = "+real+"+"+imaginary+"i");
	    }
	    public void Difference(){
	        int real = x-y;
	        int imaginary = z-w;
	        System.out.println("Difference = "+real+"+"+imaginary+"i");
	    }
	    public void Product(){
	        int real = (x*y)-(z*w);
	        int imaginary = (x*w)+(y*z);
	        System.out.println("Product = "+real+"+"+imaginary+"i");
	}
}