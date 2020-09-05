import java.util.Scanner;

public class secondLargest {

	public static int scndLargest(int a[],int n) {
		int temp;  
		for (int i=0; i<n; i++) {
		     for (int j=i+1; j<n; j++) { 
		          if (a[i] > a[j]) {  
		              temp = a[i];  
		              a[i] = a[j];  
		              a[j] = temp;  
		           }  
		      }  
		 }  
		 return a[n-2];  
	}  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int l2=scndLargest(a,n);
		System.out.println("Second largest: "+l2);
	}
}
