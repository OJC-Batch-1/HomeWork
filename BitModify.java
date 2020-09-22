class BitModify{
	static int additionOfNum(int n){
		if(n==0){
		  return(~n);
		}
		return (-(~n));
	}
  static void swapOfNum(int a,int b){
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("after swapping 1st number is ::="+a + "  second numbers=" +b);
  }
	
public static void main(String arg[]){
 System.out.println("result=" +additionOfNum(0));
 swapOfNum(8,4);
 }
}
