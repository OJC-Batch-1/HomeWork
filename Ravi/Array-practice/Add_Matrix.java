import java.util.Scanner;
public class Add_Matrix {
   public static void main(final String[] args){
      /*Taking 1st array element input */ 
      final Scanner sc = new Scanner(System.in);
         System.out.print("Enter no of row and column for 1st array : ");
         final int r1 = sc.nextInt();
         final int c1 = sc.nextInt();
         System.out.println("Enter elements of the 1st array :");
         final int a1[][] = new int[r1][c1];
         for(int i=0; i<r1; i++)
         {  for(int j=0; j<c1; j++){
               a1[i][j] = sc.nextInt();
            }
         }

       /*Taking 2nd array element input */ 
          System.out.print("Enter no of row and column for 2nd array : ");
         final int r2 = sc.nextInt();
         final int c2 = sc.nextInt();
         System.out.println("Enter elements of the 2nd array :");
         final int a2[][] = new int[r2][c2];
         for(int i=0; i<r2; i++)
         {  for(int j=0; j<c2; j++){
               a2[i][j] = sc.nextInt();
            }
         }


         if(r1 == r2 && c1 == c2){
            final int r3=r2,c3=c2;
            final int a3[][] = new int[r3][c3];
            System.out.println("Sum of two matrix is :");
            for(int i=0; i<r3; i++)
            {  for(int j=0; j<c3; j++)
               {
                  a3[i][j] = a1[i][j] + a2[i][j];
                  System.out.print(a3[i][j]+"\t");
               }
               System.out.println();
            }
         }
      sc.close();
   }   
}
