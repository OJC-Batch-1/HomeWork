import java.util.*;
public class Removeel
{
    public static void main(String[]args)
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to remove");
        int el=sc.nextInt();
        int arrmod[]=new int[num-1];
        boolean flag=false;
        for(int i=0,j=0;i<num;i++){
            if(arr[i]==el){
                continue;
            }else if(j==num-1){
                flag=true;
                break;
            }
            arrmod[j++]=arr[i];
        }
        if(flag){
           System.out.println("element not found!!") ;
        }else{
            for(int x:arrmod){
                System.out.print(x+" ");
            }
        }
    }
}