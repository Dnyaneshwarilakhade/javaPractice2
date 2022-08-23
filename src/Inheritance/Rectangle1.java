package Inheritance;

public class Rectangle1 {     //parent class
	
	
	protected int L,B;
	
	
	public void show() {
		System.out.println("this is  class");
	}
	
	
	public void setValue(int l,int b) {
		L=l;
		B=b;
	}
	public void area() {
		int A=L*B;
		System.out.println("area of rect is:"+A);
	}
	

}
