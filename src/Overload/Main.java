package Overload;

public class Main {
	public static void main(String[] args) {
		
	BusinessLogic b=new BusinessLogic();
	b.sum();
	b.sum(25);

	b.sum(25,25,25);
	b.sum(5.5, 5.5);
	
	b.sum(2,20);
}
}
