package arraypractice;
import java.util.*;
public class InsertElement {
	public static void inserts(int arr[]) {
		List<Integer> a=new ArrayList<Integer>();
		for(Integer text:arr) {
			a.add(text);
		}
		 a.add(2,35);
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr1[]= {25,14,56,15,36};
		inserts(arr1);
		
	}
}
