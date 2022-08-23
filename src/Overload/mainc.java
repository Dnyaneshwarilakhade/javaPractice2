package Overload;

public class mainc {
	
	
	public void display() {
		System.out.println("hii");
	}
	public static void main(String args[]) {
		Sample.main("hii");
		Sample.main("welcome to home");
		Sample.main(args, 2);
		

		}
}
