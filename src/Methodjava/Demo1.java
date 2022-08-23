package Methodjava;

public class Demo1 {

	
	public static void t1() {
		System.out.println("this is static 1");
	}
	public static void t2() {
		System.out.println("this is static 2");
	}
	
	public void t3() {
		System.out.println("this is non static 1");
	}
	public void t4() {
		System.out.println("this is non static 2");
	}
	
	
	public static void main(String[] args) {
		Demo1.t1();
		Demo1.t2();
		t1();
		t2();
		
		Demo1 d1=new Demo1();//object creation
		d1.t3();
		d1.t4();
	}
}
