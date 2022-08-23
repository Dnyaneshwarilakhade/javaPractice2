package JavaPractise;

public class CopyArray {
	public static void main(String[] args) {
		//initialize
		int a[]= {10,20,30,40,50};
		//create new array
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}	
		System.out.println("contents of a[]:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("contents of b[]:");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+" ");
		}
		}
	}


