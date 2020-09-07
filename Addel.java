import java.util.*;
public class Addel
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
        System.out.println("enter the element to add and at which index");
        int el=sc.nextInt();
        int ind=sc.nextInt();
        int arrmod[]=new int[num+1];
        boolean flag=false;
        if(ind>=num||ind<0){
            System.out.println("index out of bound");
            System.exit(1);
        }
        for(int i=0,j=0;i<num+1;i++){
            if(i==ind){
                arrmod[j++]=el;
            }else if(i>ind){
                arrmod[j++]=arr[i-1];
            }else{
                arrmod[j++]=arr[i];
            }
        }
        for(int x:arrmod){
            System.out.print(x+" ");
        }
    }
}