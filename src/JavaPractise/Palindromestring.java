package JavaPractise;

public class Palindromestring {
	public static void main(String[] args) {
		
		String original="madam";
		String rev="";
		
		for(int i=original.length()-1;i>=0;i--) {
			rev=rev+original.charAt(i);
			
		}System.out.println(rev);
		
		System.out.println();
		
		if(original.equals(rev)) {
           System.out.println("string is palindrome");			
		}else {
			System.out.println("string is not palindrome");
		}
		
		
	}

}
