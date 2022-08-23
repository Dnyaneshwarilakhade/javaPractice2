package Overload;

public class Cmain {
	public static void main(String[] args) {
		
		ConstructorOverLd cd=new ConstructorOverLd();
		ConstructorOverLd cd1=new ConstructorOverLd(25,20);
		
		ConstructorOverLd cd2=new ConstructorOverLd(1.23f,3.1456); //can we overload float and double
		
		ConstructorOverLd cd3=new ConstructorOverLd(4,45);
		

	
	}
}