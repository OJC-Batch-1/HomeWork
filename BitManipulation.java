import java.util.Scanner;
class BitManipulation{
	static boolean even_odd(int n){
		String str=(((n & 1)!=1)==true ? "Even" : "odd");
		System.out.println(str);
		return ((n & 1)!=1);
	}
	static boolean oppositeSign(int n,int m){
		return ((n ^ m) < 0);  
    } 
 public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter two elements:: ");
int n=sc.nextInt();
int m=sc.nextInt();
	even_odd(n);
	if (oppositeSign(n,m) == true) 
            System.out.println("Signs are opposite"); 
        else
            System.out.println("both numbers are of same sign"); 
	
	}
}
		
	