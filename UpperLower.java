package bit_manipulation;
import java.util.*;
public class UpperLower {
	static int a=32;
	static void uppertolower(String str) {
		char s[]=str.toCharArray();
		for (int i = 0; i < s.length; i++) {
			s[i]=(char) (s[i] & ~a);
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		uppertolower(s1);
	}
}
