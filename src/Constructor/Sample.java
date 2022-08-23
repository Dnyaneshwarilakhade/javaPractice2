package Constructor;

public class Sample {

	int F,I;
	
	public Sample() {
		F=1;
		I=1;
	}
	public Sample(int f,int i) { //constructor overload
		F=f;
		I=i;
	}
	
	public void showData() {
		System.out.println(F+"feets"+I+"inches");
	}
}
