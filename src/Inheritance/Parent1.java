package Inheritance;

public class Parent1 {
	
	protected int A,B;

	Parent1(){
		System.out.println("this is parent class constructor");
	}
	
	Parent1(int a){
		System.out.println("parent class one argument const");
	}
	
	public void show() {
		System.out.println("single level inheritance");
	}
	
	
	public void sum(int a,int b) {
		System.out.println("sum is:"+(a+b));
	}
}
