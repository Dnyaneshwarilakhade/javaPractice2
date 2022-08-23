package Inheritance;

abstract public class Rectangle {
	int L,B;
	
	public void setValue(int l,int b) {
		L=l;
		B=b;
	}
	public void area() {
		int A=L*B;
		System.out.println("area is "+A);
	}
	 abstract public void perimeter();

	 
	
}
