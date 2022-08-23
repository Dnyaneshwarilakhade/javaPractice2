package Constructor;

  public class Test {
	int A,B,C;
	
	 Test() {
		System.out.println("this is default constructor");
	}
	 
	  Test(int a,int b){
		  this();
		  System.out.println("constructor with two arguments");
		  A=a;
		  B=b;
	  }
	  Test(int a,int b,int c){
		  this(a,b);
		  System.out.println("constructor with 3 arguments");
		  C=c;
	  }
	  public void display() {
		 
		  System.out.println("A="+A);
		  System.out.println("B="+B);
		  System.out.println("C="+C);
	  }
	  public static void main(String[] args) {
		  Test T=new Test();
		   T.display();
		  
		   Test T1=new Test(1,2);
		   T1.display();
		   
		   
		  Test T2=new Test(4,5,6);
	   T2.display();
	  }

}
