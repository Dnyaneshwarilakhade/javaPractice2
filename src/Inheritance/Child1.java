package Inheritance;

public class Child1 extends Parent1 {
	
	public void sum() {
		int sum=A+B;                           //we can only use protected data members
		System.out.println(sum);
	}
	
	Child1(){
		
		System.out.println("child constructor");
	}
	
	Child1(int x){
		
		System.out.println("child class one argument const");
	}
	public void display() {
		System.out.println("this is child class");
	}

}
