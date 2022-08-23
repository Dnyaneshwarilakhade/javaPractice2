package pattern;

public class PatternPra {
	public static void main(String[] args) {
		
	
	
//	    1 
//	   1 2 
//	  1 2 3 
//	 1 2 3 4 
//	1 2 3 4 5 
	
	
	for(int i=1;i<=5;i++) {
		for(int k=4;k>=i;k--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
		System.out.print(j+" ");
	}
		System.out.println();
	}
	
	System.out.println("===========================");
	
//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 
	
	int count=0;
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			count=count+1;
			System.out.print(count+" ");
		}
		System.out.println();
	}
	
	System.out.println("---------------------------------");
	
//	1 
//	2 1 
//	3 2 1 
//	4 3 2 1 
//	5 4 3 2 1 
	
	
	for(int i=1;i<=5;i++) {
		for(int j=i;j>=1;j--) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	System.out.println("======================================");
	
	
//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5
// 6 6 6 6 6 6
//7 7 7 7 7 7 7
	
	for(int i=1;i<=7;i++) {
		for(int k=6;k>=i;k--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	System.out.println("______________________");
		
		
//	7 7 7 7 7 7 7
//	 6 6 6 6 6 6
//	  5 5 5 5 5
//	   4 4 4 4
//	    3 3 3
//	     2 2
//	      1	
	for(int i=7;i>=1;i--) {
		for(int k=1;k<=7-i;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	System.out.println("----------------------------------");
//	
	
//	      7
//	     6 7
//	    5 6 7
//	   4 5 6 7
//	  3 4 5 6 7
//	 2 3 4 5 6 7
//	1 2 3 4 5 6 7
	
	for(int i=7;i>=1;i--) {
		for(int k=6;k>=7-i;k--) {
			System.out.print(" ");
		}
		for(int j=i;j<=7;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println("----------------");
	
//     7
//    7 6
//   7 6 5
//  7 6 5 4
// 7 6 5 4 3
//7 6 5 4 3 2
//7 6 5 4 3 2 1
	
	for(int i=7;i>=1;i--) {
		for(int k=6;k>=7-i;k--) {
			System.out.print(" ");
		}
		for(int j=7;j>=i;j--) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	
//	1 2 3 4 5 6 7
//	 2 3 4 5 6 7
//	  3 4 5 6 7
//	   4 5 6 7
//	    5 6 7
//	     6 7
//	      7
	
//	for(int i=1;i<=7;i++) {
//		for(int j=7;j>=i;j--) {
//			System.out.print(j);
//		}
//		System.out.println();
//	}
//	7654321
//	765432
//	76543
//	7654
//	765
//	76
//	7
	
	System.out.println("---------------------");
	for(int i=1;i<=7;i++) {
		for(int k=1;k<=i;k++) {
			System.out.print(" ");
		}
		for(int j=i;j<=7;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
//	
//	7 6 5 4 3 2 1
//	 7 6 5 4 3 2
//	  7 6 5 4 3
//	   7 6 5 4
//	    7 6 5
//	     7 6
//	      7
	for(int i=1;i<=7;i++) {
		for(int k=1;k<=i;k++) {
			System.out.print(" ");
		}
		for(int j=7;j>=i;j--) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
//	1 2 3 4
//	5 6 7
//	8 9
//	10
	
	
//	1
//	3 2
//	4 5 6
//	10 9 8 7
//	11 12 13 14 15
	

}
}