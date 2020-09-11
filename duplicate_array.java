import java.util.*;
public class duplicate_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>0){
                System.out.print(arr[i]+" ");
            }
            count=0;
        }
    }
}