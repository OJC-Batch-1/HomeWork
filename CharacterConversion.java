package Bit_Manipulation;

import java.util.Scanner;

public class CharacterConversion {

		static void tolowercase(String str) {
			char l[]=str.toCharArray();
			for (int i = 0; i < l.length; i++) 
				l[i]=(char) (l[i] | 32);
			System.out.println(l);
		}
		
		
		static void toUppercase(String st) {
			char u[]=st.toCharArray();
			for (int i = 0; i < u.length; i++)
				u[i]=(char) (u[i] & ~32);
			System.out.println(u);	
		}
		
		
		static void pos_of_character(char[] p) {
			if(p[0]>=65 && p[0]<=90) {
				int pos=p[0]^64;
				System.out.println(p[0]+"->"+pos);
			}
			else
				System.out.println("Not in uppercase");
			
		}
		
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string: ");
			String s=sc.nextLine();
			//tolowercase(s);
			//toUppercase(s);
			pos_of_character(s.toCharArray());

	}

}
