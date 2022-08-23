package Constructor;

public class Demo {

	int i;
	String str;
	
	//zero argument constructor
	
	Demo(){
		i=10;
		str="duggu";
	}
	
	//with argument constructor
	
	Demo(int c,String d){
		i=c;
		str=d;
	}
	
	//method print
	
	public void show()
	{
		System.out.println(i);
		System.out.println(str);
	}
	
}
