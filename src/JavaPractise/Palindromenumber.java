package JavaPractise;

public class Palindromenumber {

	public static void main(String[] args) {
		int number=1111;
		int temp;
		int reverse=0;
		temp=number;
		
		while(number!=0) {
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		System.out.println("the reverse of the given no is:"+reverse);
		
		
//		if(temp==reverse) {
//			System.out.println("the no palindrome");
//		}else 
//		{
//			System.out.println("the no is not palindrome");
//		}
		
		
		if(temp==reverse) {
			System.out.println("the no palindrome");
		}else 
		{
			System.out.println("the no is not palindrome");
		}
	}
}
