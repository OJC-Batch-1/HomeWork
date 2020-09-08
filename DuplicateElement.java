package arraypractice;
import java.util.*;
public class DuplicateElement {
	public void duplicacy(int arr[]) {
		for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate element is "+arr[j]+" ");
                }
            }
		}
       
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr1[]= {5,2,7,7,5};
		DuplicateElement d=new DuplicateElement();
		d.duplicacy(arr1);
		
	}
}
