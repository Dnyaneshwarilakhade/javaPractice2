package Overload;

public class StaticChild extends  StaticOverload{
	
	public  void m1() {
		System.out.println("hellom2");
	}
	
	
	
	public static void display() {         ///not override
		System.out.println("childclass");
	}

	public static void main(String[] args) {
		StaticChild s=new StaticChild();
		s.display();
		s.display(1);
	}
}
