import java.util.*;

class ArrayProb{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        // // que no.1 remove any specific element from array

        int []a={25,14,56,15,20,19};
       
        System.out.print("Enter the elements to be removed :");
        int Elementdel = sc.nextInt();
        
        int temp = 0;

        for(int i=0;i<a.length;i++){
            if(Elementdel==a[i]){
                for(int j=i;j<a.length-1;j++){
                    a[j]=a[j+1];
                    
                }
                temp++;
                
            }
        }
        if(temp==0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("new aaray is :");
            for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
            }
        } 

        // // que no. 02 insert element in array at specific location

            
        int array[]=new int[7];
        System.out.println("Enter the location of element to be inseted in array :");
        int location = sc.nextInt();
        System.out.println("Enter the value to be inseted at location :");
        int value = sc.nextInt();

        for(int i=a.length-1;i>location;i--){
            a[i]=a[i-1];
        }
        a[location]=value;

        System.out.println("Array after inserting new element :");
        for(int i=0;i<a.length;i++){
            array[i+1]=a[i];
            System.out.print(array[i+1]+" ");
        }
        


        // que no. 03 to find the duplicate element in an array

        // int []arr={1,2,3,4,5,6,4};
        
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate element is "+arr[j]+" ");
                }
            }
        }


        // que no.04 addition of matrices

        int matrixone[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int matrixtwo[][] = {{2,3,4},{1,5,6},{2,7,6}};
        int sum[][] =new int[3][3]; 

        for(int i=0;i<matrixone.length;i++){
            for(int j=0;j<matrixtwo.length;j++){
                sum[i][j]=matrixone[i][j]+matrixtwo[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}