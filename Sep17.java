import java.util.Scanner;
class Sep17{
	static void upper_tolowercase(char ch){
		int a=ch^32;
		System.out.println("after changing Uppercase to lowercase ="+(char)a);
	}
	static void lower_toUpper(char c){
		int b=c^32;
		System.out.println("after changing lowercase to Uppercase ="+(char)b);
	}
	static void findPositionOfUppercase(char ch){
	int a=(int)ch^64;
	System.out.println("Position of Uppercase letter="+a);
	}
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any Uppercase character ");
	char ch=sc.next().charAt(0);
	upper_tolowercase(ch);
	System.out.println("enter any lowercase character ");
	char c=sc.next().charAt(0);
	lower_toUpper(c);
	findPositionOfUppercase(ch);
	}
  
  }