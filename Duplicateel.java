import java.util.*;
public class Duplicateel
{
    public static void main(String[]args)
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        int count[]=new int[num];
        String arrv[]=new String[num];
        System.out.println("Enter the elements of array:");
        for(int i=0,k=0;i<num;i++,k++)
        {
            arr[i]=sc.nextInt();
            arrv[k]="not visited";
            count[i]=1;
        }
        for(int i=0;i<num;i++){
            if(arrv[i]=="not visited"){
                for(int j=i+1;j<num;j++){
                    if(arr[i]==arr[j]){
                        count[i]++;
                        arrv[j]="visited";
                    }
                }
                System.out.println("Count "+arr[i]+" = "+count[i]);
            }
        }
    }
}