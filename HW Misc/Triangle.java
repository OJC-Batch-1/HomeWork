import java.util.Scanner;
public class Triangle{
    static int a,b,c;
    static float s;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three sides of triangle");
        a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
        System.out.println("perimeter: "+perimeter(a,b,c));
        System.out.println("area: "+area());
    }
    public static float perimeter(int a,int b,int c){
        return a+b+c;
    }
    public static double area(){
        float s=perimeter(a,b,c)/2;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
    }
}