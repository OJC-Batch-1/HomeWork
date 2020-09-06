
/*   Write a program to find the second largest number in an array using only one loop 

*/



public class Secondhighest {

	public static void main(String[] args) {
		int arr1[] = {2, -5, 6, 1, -8, 0, 4, 9};
		int lgt = arr1[0],sndlgt = arr1[1];
		for(int i=0;i<arr1.length;i++) {
			if(lgt<arr1[i]) {
				sndlgt=lgt;
				lgt=arr1[i];
			}
			else if(arr1[i] > sndlgt && arr1[i]!= 0) {
				sndlgt = arr1[i];
			}
		}
		System.out.println(sndlgt);
	}

}