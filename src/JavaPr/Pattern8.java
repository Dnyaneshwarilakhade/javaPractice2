package JavaPr;

public class Pattern8 {
	public static void main(String[] args) {
		
		
		// This for  loop is for row increment
//		for (int i=1;i<=5;i++) {
//			for (int j=4;j>=i;j--) {
//				System.out.print(" ");
//			} // This for loop is to print spaces
//			for (int k=1;k<=i;k++) {
//				System.out.print(" *");
//			} // This for loop is to print *
//			System.out.println();
//		}
		
		
		
		int count=0;
		for (int i=1;i<=4;i++) {//row
			for (int j=1;j<=i;j++) {     //printing o/p
				count= count+1;
				System.out.print(count+ " ");
			}
			System.out.println();
		}


	}

}
