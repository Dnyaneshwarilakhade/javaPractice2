package Constructor;

public class Defaultc {

	int a;
	boolean b;
	
	public Defaultc() {
		
	}
	
	public void show() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Defaultc dc=new Defaultc();
		dc.show();
	}
}
