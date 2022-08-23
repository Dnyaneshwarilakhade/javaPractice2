package AbstractPractice;

public class Demo2 extends Demo1 {
	
	public void test2() {
		System.out.println("test 2 completed");
	}
	
	public static void main(String[] args) {
		Demo2 dm=new Demo2();
		dm.test();
		dm.test1();
		dm.test2();
		
		dm.test3();
		//Demo.test3();
	}

}
