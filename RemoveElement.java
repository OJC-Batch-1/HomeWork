package arraypractice;
import java.util.*;
public class RemoveElement {
	static void remove(int arr[],int n) {

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==n)
			{
				continue;
			}
		
		System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter the elements of the array:");
		for (int j = 0; j < arr1.length; j++) {
			arr1[j]=sc.nextInt();	
			}	
		System.out.println("Array element before removing:"+Arrays.toString(arr1));
	System.out.println("Enter number to remove element from the given array:");
		int num=sc.nextInt();
		System.out.println("After removing element:");
		remove(arr1,num);
	}
}
