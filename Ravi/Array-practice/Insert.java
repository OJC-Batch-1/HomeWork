
import java.util.*;

public class Insert {
   public static void insertEle(int[] arr, int n, int p){
      System.out.println("Array after inserting "+n+" at "+p+" position : ");
      int temp = 0,swap;
      for(int i=0;i<arr.length;i++){
         if(i<p)  System.out.println(arr[i]);
         else if(i==p){
            temp = arr[i];
            arr[i] = n;
            System.out.println(arr[i]);
         }
         else{
            swap = arr[i];
            arr[i] = temp;
            temp = swap ; 
            System.out.println(arr[i]);
         }
      }
      System.out.println(temp);
   }
   public static void main(String[] args)
   {  Scanner sc = new Scanner(System.in);
      /*Taking array element input */ 
      System.out.print("Enter no of elements for array : ");
      int n = sc.nextInt();
      System.out.println("Enter "+n+ " elements of the array :");
      int a[] = new int[n];
      for(int i=0;i<n;i++)
      {
         a[i] = sc.nextInt();
      }
      /*Taking input the position and new element*/
      System.out.print("Enter the new element value : ");
      int newE = sc.nextInt();
      System.out.print("Enter the position to insert : ");
      int pos = sc.nextInt();
      if(pos>n)
         System.out.println("Invalid position value. Hence, new element cannot be inserted.");
      else
         insertEle(a,newE,pos-1);
         sc.close();
   }   
}
