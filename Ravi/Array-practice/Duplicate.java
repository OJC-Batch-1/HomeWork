import java.util.Scanner;
class Duplicate {
   public static void duplicateEle (final int[] a) {
      for(int i=0; i<a.length; i++ )
      {
         int count = 1,temp;
         if(a[i] != 0)
         {
            temp = a[i];
            for(int j=i+1; j<a.length; j++)
            {
               if(temp == a[j])
               {
                  count++;
                  a[j] = 0;
               }
            }
         }
         if(count > 1)
            System.out.println(a[i] + " : "+ count);
      }
   }
   public static void main(final String[] args) {
      final Scanner sc = new Scanner(System.in);
      /*Taking array element input */ 
      System.out.print("Enter no of elements for array : ");
      final int n = sc.nextInt();
      System.out.println("Enter "+n+ " elements of the array :");
      final int arr[] = new int[n];
      for(int i=0;i<n;i++)
      {
         arr[i] = sc.nextInt();
      }

      duplicateEle(arr);
      sc.close();
   }
}