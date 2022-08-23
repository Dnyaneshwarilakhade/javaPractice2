package JavaPr;

public class largest_arrayel {
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) 
				max=a[i];
		}
				System.out.println("largest element is "+max);
				
				
				//largest of two nos
				int x=25;
				int y=30;
				if(x>y) {
					System.out.println("x is largest");
				}else {
					System.out.println("y is largest");
				}
		
				//swipe of two no using third no
				int p=10,q=20;
				int r;
				r=p;
				p=q;
			    q=r;
				System.out.println("value of p: "+p);
				
				
				System.out.println("value of q: "+q);
				
				
				
				
			}
		}
	

