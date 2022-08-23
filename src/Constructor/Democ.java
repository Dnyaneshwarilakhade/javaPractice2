package Constructor;

public class Democ {
	
	 int X,Y;        //we can use private here also
	
	
	Democ(){
		System.out.println("Default constructor");
	}
	
	Democ(int x,int y){
		
		this();
		X=x;
		Y=y;
		System.out.println("two argumrnt constructor");
		
	}
	
	Democ(int x,int y,int z){
		this(x,y);
		System.out.println("constructor with 3 arguments");
	}
	
	public void sum() {
		int Z=X+Y;
		System.out.println("sum is"+Z);
	}

}
