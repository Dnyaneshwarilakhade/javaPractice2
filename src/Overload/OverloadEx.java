package Overload;

public class OverloadEx {
	
	public static void main(String args) {
		System.out.println("Overload main method with one string");
	}

	public static void main(String[] args) {
		System.out.println("Default main");
		
		main("Hello");
	}
}
