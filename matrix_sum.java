import java.util.*;
public class matrix_sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        if(row == col){
        System.out.println("Enter elements of 1st array:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of 2nd array:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                b[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("After summation:");

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
}