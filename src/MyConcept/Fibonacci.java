package MyConcept;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n=6;
		int i=1,j=1;     //1,1,2,3,5,8;
		if(n>=1) {
			System.out.println(i+"");
		}
		if(n>=2) {
			System.out.println(j+"");
		}
		if(n>=3) {
			int k=3,c=0;
			while(k<=n) {
				c=i+j;
				System.out.println(c+"");
				i=j;
				j=c;
				k++;
			}
			
		}
	}
}
