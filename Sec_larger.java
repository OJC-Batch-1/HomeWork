import java.util.*;
public class Sec_larger
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int max=0;
		int smax=0,temp=0;
		int[] array=new int[size];
		for(int i=0;i<size;i++)
			array[i]=sc.nextInt();

		for(int j=0;j<size;j++){  //Single loop
			if(array[j]>max){
				temp=max;
				max=array[j];
				}
			if(smax<max)
				smax=temp;
		}
		System.out.println(smax);

		}
		
	}
		