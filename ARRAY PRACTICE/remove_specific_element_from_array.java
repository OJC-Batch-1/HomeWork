import java.util.*;
public class remove_specific_element_from_array
{
    public static void main(String[]args)
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers in the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //int y=0;
        System.out.println("enter the number which you want to remove:");
        int x=sc.nextInt();
        System.out.println("after removing elements:");
        for (int y=0;y<n;y++)
        {
           if(arr[y]==x)
           {
               continue;
           }
           
               
    System.out.println(arr[y]+" ");
           
        }
    
    }
}