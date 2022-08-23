package Inheritance;

public class RectangleMain extends Rectangle{
	
	 public void perimeter() {
		 int P=2*(L+B);
		 System.out.println("perimeter"+P);
	 }

	 
	 public static void main(String[] args) {
		 RectangleMain R=new RectangleMain();
		R.setValue(10, 5);
		R.area();
		R.perimeter();
		
	}
}
