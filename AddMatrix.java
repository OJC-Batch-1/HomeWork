package arraypractice;

public class AddMatrix {
	public static void sum(int a[][],int b[][]) {
		int result[][]=new int[a.length][b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				  result[i][j] = a[i][j]+b[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
			
		}

	}
	public static void main(String[] args) {
		int a1[][]= {{1,2,1},{2,1,3},{3,2,1}};
		int b1[][]=	{{2,1,2},{3,2,1},{1,3,2}};
		sum(a1,b1);
	}
}
