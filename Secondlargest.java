import java.util.*;
class Secondlargest {
    public static int largest(int arr[],int n)    {
       
        int max1=arr[0],max2=arr[0];
        for(int i=0;i<n;i++)    {
            if(max1<arr[i]) {
                max2=max1;
                max1=arr[i];
            }
            else if(max2<arr[i] && arr[i]!=max1)
                max2=arr[i];
        }
        return max2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)    
            arr[i]=sc.nextInt();
        System.out.printf("Second largest element is %d. ",largest(arr,n));
    }
}