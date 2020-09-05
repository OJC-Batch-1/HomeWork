import java.util.*;
public class second_largest_element
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of an array:");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int firstlargest,second_largest;
        if(arr[0]>arr[1])
        {
            firstlargest=arr[0];
            second_largest=arr[1];

        }
        else
        {
            firstlargest=arr[1];
            second_largest=arr[0];
        }
        for(int j=2;j<n-1;j++)
        {
            if(arr[1]>firstlargest)
            {
                second_largest=firstlargest;
                firstlargest=arr[j];

            }
            else if(arr[j]>second_largest)
            {  second_largest=arr[j];

            }
        }
        System.out.println("second largest number is"+second_largest);
        }
        
    }
