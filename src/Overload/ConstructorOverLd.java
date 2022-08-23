package Overload;

public class ConstructorOverLd {

	
	int x;
	int y;
	byte b;
	short s;
	float r;
	double m;
	
	ConstructorOverLd(){
		System.out.println("zero argument const");
	}
	
	ConstructorOverLd(int a,int b){
		x=a;
		y=b;
		
		System.out.println(x);
		System.out.println(y);
	}
	
	ConstructorOverLd(float a,double b){
		r= a;
		m= b;
		System.out.println(r);
		System.out.println(m);
	}
	
	
	ConstructorOverLd(byte p,short q ){
	b=p;
	s=q;
	
	System.out.println(b);
	System.out.println(q);
	
	}
	ConstructorOverLd(double c,float d){
	
	System.out.println(c);
	System.out.println(d);
	
	
	}
	

	
}
