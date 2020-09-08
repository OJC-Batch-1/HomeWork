package arraypractice;
import java.util.*;
public class Insert {
	public static void insretion(int arr[],int index,int num) {
		for (int i = 0; i <  arr.length; i++) {
			if(i==index && index!=arr.length-1) {
				int temp=arr[i];
				arr[i]=num;
				arr[i+1]=temp;
			}
			else if(arr.length-1==index) {
				arr[arr.length-1]=num;
			}
			
			else if(i<index) {
				i=arr[i];
			}
			else {
				int k=i+1;
				k=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int arr1[]=new int[n+1];
		System.out.println("Enter the element of the array:");
		for (int j = 0; j < n; j++) {
			arr1[j]=sc.nextInt();
			}
		
		System.out.println("Enter the index of the array where you wanna insert between array size:");
		int idx=sc.nextInt();
		System.out.println("enter the number for inserting in the array:");
		int no=sc.nextInt();
		insretion(arr1,idx,no);
	}

}
