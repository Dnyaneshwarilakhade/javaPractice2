package Inheritance;

public class SchoolMain {
	public static void main(String[] args) {
		
		Preprimary p1= new Preprimary();
		p1.scname("Jageshwar vidyalay Wadegaon");
		p1.scaddress("Wadegaon");
		p1.stdname("RINA");
		p1.stdclassname("LKG");
		p1.stdaddress("AKOLA");
		p1.stdmedium("ENGLISH");
		
		p1.age();
		p1.standard();
		p1.subject();
		
		
		Primary p2= new Primary();
		p2.scname("GAJANAN VIDYALAY");
		p2.scaddress("RAJURI");
		p2.stdname("AMIT");
		p2.stdclassname("1");
		p2.stdaddress("NAGPUR");
		p2.stdmedium("HINDI");
		
		p2.age(); ///method overriding same method name and same parameter
		p2.standard();
		p2.subject();
		
		
		Secondary p3= new Secondary();
		p3.scname("pravara school");
		p3.scaddress("CHAS");
		p3.stdname("sumit");
		p3.stdclassname("6");
		p3.stdaddress("PUNE");
		p3.stdmedium("MARATHI");
		
		p3.age();
		p3.standard();
		p3.subject();
	}

}
