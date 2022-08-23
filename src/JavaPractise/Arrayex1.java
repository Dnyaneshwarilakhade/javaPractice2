package JavaPractise;

public class Arrayex1 {

	public static void main(String[] args) {
		//declare single dim.array
		
		int a[]=new int[5];
		
		//add the values in array
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		
		//size of array
		System.out.println("size of array is"+a.length);
		
		//read/print the values in array
		
		for(int i=0;i<a.length;i++) {
		System.out.println(+a[i]);
	}
	}
}
	

