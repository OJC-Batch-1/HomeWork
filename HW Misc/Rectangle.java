import java.util.Scanner;
public class Rectangle{
    private int a,b;
    private float perimeter,area;
    public Rectangle(int a,int b){
        this.a=a;
        this.b=b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sides of rectangle");
        int l=sc.nextInt(),b=sc.nextInt();
        Rectangle rect=new Rectangle(l,b);
        System.out.println("perimeter: "+rect.perimeter());
        System.out.println("area: "+rect.area());
    }
    public float perimeter(){
        return 2*(a+b);
    }
    public double area(){
        return a*b;
    }
}