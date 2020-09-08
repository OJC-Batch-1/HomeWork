import java.util.*;
class ArrayPractice{
//To remove particular element
static void removeElefromArr(){
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array ");
int size=sc.nextInt();

int[] arr=new int[size];
System.out.println("enter elements in array: ");
for(int i=0;i<size;i++){
	arr[i]=sc.nextInt();
}
System.out.println("enter the element that you want to remove from Array ");
int del=sc.nextInt();

for(int i=0;i<arr.length;i++){
		if(arr[i]==del){
			continue;
		}
System.out.print(arr[i]+ " ");
}
}
//addition of two matrix
static void addMatrix(){
	int[][] matrix1=new int[3][3];
	int[][] matrix2=new int[3][3];
	int[][] sum=new int[3][3];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of 3 by 3 in first Matrix ");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			matrix1[i][j]=sc.nextInt();
		}
	}
	System.out.println("enter value of 3 by 3 in 2nd Matrix ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				matrix2[i][j]=sc.nextInt();
			}
		}
		//addition of two matrix
	for( int i=0;i<3;i++){
		for( int j=0;j<3;j++){
			sum[i][j]= matrix1[i][j]+ matrix2[i][j];
		}
	}
	System.out.println("display matrix1:: ");
  for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		System.out.print(matrix1[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("display matrix2:: ");
  for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		System.out.print(matrix2[i][j]+" ");
		}
		System.out.println();
	}
	//display summation of matrix
	System.out.println("sum of two matrix:: ");
  for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		System.out.print(sum[i][j]+" ");
		}
		System.out.println();
	}
}
// to insert an element in array //need modification in this program
static void insertEleinArray(){
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array: ");
int size=sc.nextInt();
int[] arr=new int[size];
System.out.println("enter elements of array:: ");
for(int i=0;i<size;i++){
	arr[i]=sc.nextInt();
	}
System.out.println("enter the element which is to be added in array: ");
int addele=sc.nextInt();
System.out.println("enter the position at which element is to be added: ");
int pos=sc.nextInt();
int[] newarr=new int[size+1];
if(pos>size||pos<0){
System.out.println("pos out of bound ");
System.exit(1);
}
for(int i=0;i<size+1;i++){
	if(i<pos-1){
		newarr[i]=arr[i];
	}
	else if(i==pos-1)
		newarr[i]=addele;
	else{
	newarr[i]=arr[i-1];
	}
  }
 System.out.println("Array with " +addele + "inserted at position "+pos + Arrays.toString(newarr));
}
//count dublicate element present in array //need modification of counting of element
static void countDublicateEleinArray(){
Scanner sc=new Scanner(System.in);
System.out.println("enter number of elements in Array: ");
int size=sc.nextInt();
int[] arr=new int[size];
System.out.println("enter elements in array: ");
for(int i=0;i<size;i++){
	arr[i]=sc.nextInt();
}
int count=0;
for(int i=0;i<arr.length;i++){
	for(int j=i+1;j<arr.length;j++){
		if(arr[i]==arr[j]){
			count++;
			System.out.println("dublicate elements in array:"+arr[j]+ " ");
		}
	}
  }
System.out.println("count of particular elements=" + count);
}
public static void main(String arg[]){
removeElefromArr();
addMatrix();
insertEleinArray();
countDublicateEleinArray();
}
}

