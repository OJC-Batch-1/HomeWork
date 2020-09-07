import java.util.*;
public class second_largest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,-5,6,1,12,0,4,9};
        int max1 = arr[0];
        int max2 = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2 && arr[i] != max1){
                max2 = arr[i];
            }
        }
        System.out.println("Second largest element is "+max2);
    }
}
