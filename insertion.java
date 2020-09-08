import java.util.*;
public class insertion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element and position :");
        int num = sc.nextInt();
        int pos = sc.nextInt();
        int[] newarr = new int[n+1]; 
        for(int i=0; i<n+1; i++){
            if(i<pos)
            newarr[i] = arr[i];
            else if(i==pos)
            newarr[i] = num;
            else
            newarr[i] = arr[i-1];
        }
        for(int i=0; i<n+1; i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
