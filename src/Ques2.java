import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n+1];
		System.out.println("Enter array elements: ");
		int i;
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.print("Enter the elements and position to be inserted: ");
		int num=sc.nextInt();
		int pos=sc.nextInt();
		for(i=n-1;i>=pos;i--)
			a[i+1]=a[i];
		n=n+1;
		a[pos]=num;
		System.out.print("New Array: ");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}

