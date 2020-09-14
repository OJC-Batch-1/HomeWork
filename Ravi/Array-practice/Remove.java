import java.util.Scanner;
class Remove {
   public static void removeEle (int[] arr,int temp) {
      System.out.print("Array after deleting "+temp+" is ");
      for(int i=0;i<arr.length;i++)
      {  if(temp == arr[i])
         {  arr[i]=0;
            temp = i;
            break;
         }
         else 
            System.out.print(arr[i]+"\t");
      }
      for(int j = temp; j<arr.length-1;j++){
         arr[j] = arr[j+1];
         System.out.print(arr[j]+ "\t");
      }
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      /*Taking array element input */ 
      System.out.print("Enter no of elements for array : ");
      int n = sc.nextInt();
      System.out.println("Enter "+n+ " elements of the array :");
      int a[] = new int[n];
      for(int i=0;i<n;i++)
      {
         a[i] = sc.nextInt();
      }
      /*Input the element to remove*/
      System.out.print("Enter the element to remove from the array : ");
      int rem = sc.nextInt();
      removeEle(a,rem);
      sc.close();
   }
}