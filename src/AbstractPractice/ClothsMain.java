package AbstractPractice;

public class ClothsMain {
public static void main(String[] args) {
		
	MENS m=new MENS();
	m.getsize(90);
	m.getitems(20);
	m.numbers(200);
	m.brandname("denim");
	Cloths.brandname("DENIM");               //static method of abstract class
	
	System.out.println("------------------");
	
	WOMEN w=new WOMEN();
	w.getsize(80);
	w.getitems(30);
	w.numbers(300);
	w.brandname("liara");
	Cloths.brandname("LIARA"); 
	
	System.out.println("--------------------");
	
    KIDS k=new KIDS();
	k.getsize(70);
	k.getitems(50);
	k.numbers(500);
}
}
