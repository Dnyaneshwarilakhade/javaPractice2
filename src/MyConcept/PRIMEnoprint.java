package MyConcept;



public class PRIMEnoprint {
	public static void main(String args[]) {
		
		//int c=0;
		
		
		
		for(int i=1;i<=10;i++) {
			
			int c=0;
			for(int j=1;j<=i;j++)
			
			if(i%j==0) {
				c++;
			}
			if(c==2) {
				System.out.println(i);
			}
		}

	}

}
	
//	int n=7;
//	int c=0;
//	for(int i=1;i<=n;i++)
//	{
//		if(n%i==0) //c=1,c=2
//			c++;	    //c will become 2 if and only if the i becomes n i.e. no is divided  by itself and 1 called prime no
//	}
//	if(c==2) 
//		System.out.println("no is prime");
//	else 
//		System.out.println("no is not prime");
//}
