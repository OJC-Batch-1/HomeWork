/* Inserting an element in an array and removing an elementfrom an array*/

import java.util.Scanner;

public class insert_remove {
	Scanner sc =new Scanner(System.in);

	public static void main(String[] args) {
		
		insert_remove arr = new insert_remove();
		arr.insert();    //insert an element
		arr.remove(); 		//remove an element
		arr.duplicate(); 	//find duplicate element
	}


	//INSERT
private void insert(){
	int n=sc.nextInt();
	int i;
	int[] arr2 = new int[n+1];
	// Printing array element
	for(i=0;i< n;i++){
		arr2[i]=sc.nextInt();
	}
	//element to be inserted at position
	int pos=sc.nextInt();
	//element to be inserted
	int ele=sc.nextInt();
	for(i=(n-1);i>=(pos-1);i--){
		arr2[i+1]=arr2[i];
	}
	arr2[pos-1]=ele;
	//After insertion
	for(i=0;i< n;i++){
		System.out.println(arr2[i]+ " ");
	}
	System.out.println(arr2[n]);
}
	
	
	
	//REMOVE
private void remove(){
	int n=sc.nextInt();
	int i;
	int[] arr1=new int[n];
	for(i=0;i< n;i++){
		arr1[i]=sc.nextInt();
	int del = sc.nextInt();      //enter element to be deleted
	
	for(i=0;i<n;i++){
		if(arr1[i]==del){
			continue;
		}
		System.out.println(arr1[i]+ " ");
		}
	System.out.println();
	}
}	

// DUPLICATE
private void duplicate(){
	int n=sc.nextInt();
	int i,j;
	int[] arr1=new int[n];
	for( i=0;i< n;i++){
		arr1[i]=sc.nextInt();
		for(i=0;i<n;i++)
			for(j=i+1;j<n;j++){
				if(arr1[i]==arr1[j])
					System.out.println(arr1[i]+ " ");
			}
	}
	
}
}
