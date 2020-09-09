import java.util.Scanner;

public class Array_Practice {

	public static void main(String[] args) {
		int flag=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.print("Enter the elements to be deleted: ");
		int d=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==d) {
				for(int j=i;j<n-1;j++) 
					a[j]=a[j+1];
				flag=1;
				break;			
			}
		}
		if(flag==1) {
			
			System.out.print("New array: ");
			for(int i=0;i<n-1;i++)
				System.out.print(a[i]+" ");
		}
		else
			System.out.println("Element not found");
		

	}

}
