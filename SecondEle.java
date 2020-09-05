import java.util.*;

class SecondEle{
    public static int[] SecondLargest(int[] arr){
        int length = arr.length;
       
        for (int j = 0; j<length-1;j++){
            
            
            if (arr[j]>arr[j+1]){

                int temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

                j=-1;
                
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[]={3, 6, 4, 7, 9, 2, 1, 5, 8};

        arr = SecondLargest(arr);
        int Element = arr[arr.length-2];

        System.out.print(Element);
    }
}