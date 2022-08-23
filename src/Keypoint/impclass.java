package Keypoint;

public class impclass implements intd  {

	
	public void m5() {
		System.out.println("hii");
		
	}

	
	public void m6() {
		System.out.println("hello");
		
	}
	

	@Override
	public void m3() {
		System.out.println("m3");
		
	}


	@Override
	public void m4() {
		System.out.println("m4");
	}

	public static void main(String[] args) {
		impclass im=new impclass();
		im.m5();
		im.m6();
		im.m3();
		im.m4();
	}
}
