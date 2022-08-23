package Inheritance;

public class DemoMain extends Demo1 {

	public void test2() {
		System.out.println("this is test 2 completed in concrete class");
	}
	
	public static void main(String[] args) {
		
		DemoMain dm=new DemoMain();
		dm.test();
		dm.test1();
		dm.test2();
	}
	
}
