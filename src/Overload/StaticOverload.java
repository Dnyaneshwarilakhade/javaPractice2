
package Overload;

public class StaticOverload {

public  void m1() {
	System.out.println("hellom1");
}
	


public static void m1(int x) {                      //can overload static method
	System.out.println("this is static m1");
}

public static void display() {
	System.out.println("superclass");
}
public static void display(int a) {
	System.out.println("superclass1");
}



}
