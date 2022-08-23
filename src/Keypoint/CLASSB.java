package Keypoint;

public class CLASSB extends CLASSA  implements intc{
 
	@Override
	public void m2() {
		
		System.out.println("this is extends class");
		
	}

	
	@Override
	public void m3() {
		System.out.println("tjis is interface methods");
	}

	@Override
	public void m4() {
		
		System.out.println("this need to override");
		
	}
	public static void main(String[] args) {
		CLASSB c=new CLASSB();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
	}

}
