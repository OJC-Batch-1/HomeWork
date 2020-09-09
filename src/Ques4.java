import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int[][] a=new int[r][c];
		int[][] b=new int[r][c];
		System.out.println("Enter array a: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("Enter array b: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				b[i][j]=sc.nextInt();
		}
		
		int[][] k=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				k[i][j]=a[i][j]+b[i][j];
		}
		
		System.out.println("After addition of matrices: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				System.out.print(k[i][j]+" ");
			System.out.println();
		}		
	}

}
