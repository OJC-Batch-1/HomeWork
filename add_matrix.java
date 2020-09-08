// Adding two matrix

import java.util.Scanner;

public class add_matrix {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		//three 2D array
		int[][] arr1=new int[row][col];
		int[][] arr2=new int[row][col];
		int[][] arr3=new int[row][col];
		//First Array
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[row][col]=sc.nextInt();
			}
		}
		//Second Array
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr2[row][col]=sc.nextInt();
			}
		}
		
		//ADding two array
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr3[row][col]=arr1[row][col]+arr2[row][col];
			}
		}
		//Printing the sum of two array
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Matrix after addition:\n");
				System.out.println(arr3[row][col]+"\t");
			}
			System.out.println();
		}
	}

}
