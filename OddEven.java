package bit_manipulation;
import java.util.*;

public class OddEven {
	static void isoddeven(int n)
	{
		if((n & 1) == 0)
		    System.out.println("EVEN!");
		else
		    System.out.println("ODD!");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		isoddeven(num);
		
	}
}
