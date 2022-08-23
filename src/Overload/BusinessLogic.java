package Overload;

public class BusinessLogic {
	
	public void sum() {
		System.out.println("zero argument method");
	}
	public void sum(int x) {
		System.out.println("one argument method");
	}
	public void sum(byte x,short y) {
		System.out.println("sum: "+(x+y));
	}
	
	public void sum(int x,int y,int z) {
		System.out.println("sum: "+(x+y+z));
	}
	
	public void sum(double x,double y) {
		System.out.println("sum: "+(x+y));
		
		
		
	}
	
}
