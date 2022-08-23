package Methodjava;

public class Sample2 {

	//call methods
	public static void main(String[] args) {
		//static method
		Sample1 sm1=new Sample1();
		sm1.test1();
		sm1.test2();
		Sample1.test1();
		Sample1.test2();
		
		//nonstatic method
		
		Sample1 sm=new Sample1();
		sm.test3();
		sm.test4();
	}
}
