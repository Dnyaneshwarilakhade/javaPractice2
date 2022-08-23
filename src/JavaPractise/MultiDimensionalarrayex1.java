package JavaPractise;

public class MultiDimensionalarrayex1 {

	public static void main(String[] args) {
		
		//declaration of multidimensional array
		int a[][]=new int[3][2];
		
		//initialization of array
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		//no of rows
		System.out.println("no of rows:"+a.length);
		
		//no of columns
		System.out.println("no of columns:"+a[1].length);
		
		
		//read the values of array
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print( " "+ a[i][j]+" ");
			}
			System.out.println();
		}
		
	
				}
}
