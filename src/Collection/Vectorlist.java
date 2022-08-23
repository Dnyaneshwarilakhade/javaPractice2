package Collection;


import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectorlist {
	public static void main(String args[]) {
		//Vector v=new Vector();
		
		Vector<Integer> vl=new Vector<Integer>();
		
		vl.add(10);
		vl.add(210);
		vl.add(410);
		vl.add(150);
		vl.add(610);
		vl.add(320);
		vl.add(148);
		
		
System.out.println(vl);
		
		vl.add(3,40);
		System.out.println(vl);
		
		vl.set(3,2);
		System.out.println(vl);
		
		vl.remove(3);
		System.out.println(vl);
		
		vl.add(null);
		vl.add(null);
		vl.add(null);
		vl.add(64);
		vl.add(null);
		vl.add(null);
		
		System.out.println(vl);
		
		System.out.println("the size of arraylist:"+vl.size());
		
		System.out.println(vl.lastIndexOf(20));
		
		System.out.println(vl.contains(80));
		
		System.out.println(vl.get(4));
		System.out.println(vl.get(9));
		
		//to read fullarray list
		for(int i=0;i<vl.size();i++) {
			System.out.print(vl.get(i)+" ");
		}
		System.out.println();
		
		//advanced for loop
		for(Object value:vl) {
			System.out.print(value+" ");
		}
		System.out.println();
		
		
		//cursur
		Iterator<Integer> itr=vl.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		
		ListIterator<Integer> litr=vl.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
		}
		System.out.println();
		
		Collections.reverse(vl);
		System.out.println(vl);
		System.out.println();
		
		 Iterator<Integer> itr1=vl.iterator();
		 while(itr1.hasNext()) {
			 System.out.print(itr1.next()+" ");
		 }
		 System.out.println();
	



		
		
		
		
		
		
		
	}

	
	

}
