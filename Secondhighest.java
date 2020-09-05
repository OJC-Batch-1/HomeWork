public class Secondhighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int arr[]= {4,-2,5,6};
		int lg=arr[0],snd=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(lg<arr[i]) {
				snd=lg;
				lg=arr[i];
			}else if(arr[i]>snd && arr[i]!=0) {
				snd=arr[i];
			}
		}
		System.out.println(snd);
	}

}
