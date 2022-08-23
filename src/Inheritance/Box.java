package Inheritance;

public class Box extends Rectangle1 {
	
	int H;
	
	public void setValue(int l,int b,int h) {
		L=l;
		B=b;
		H=h;
	}
	public void area() {
		int S=2*(L*B+B*H+H*L);
		System.out.println("surface area of box is :"+S);
	}

	

}
