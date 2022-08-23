package Collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

import JavaPr.main;

public class Arraylist {
	public static void main(String[] args) {
		
		ArrayList al1=new ArrayList();
		
		
		al1.add(10);
		al1.add("ABC");
		al1.add('S');
		al1.add(54);
		al1.add("PQR");
		
		System.out.println(al1);
		
		al1.add(3,40);
		System.out.println(al1);
		
		al1.set(3,'P');
		System.out.println(al1);
		
		al1.remove(3);
		System.out.println(al1);
		
		al1.add(null);
		al1.add(null);
		al1.add(null);
		al1.add('S');
		al1.add(null);
		al1.add(null);
		
		System.out.println(al1);
		
		System.out.println("the size of arraylist:"+al1.size());
		
		System.out.println(al1.lastIndexOf('S'));
		
		System.out.println(al1.contains("PQR"));
		
		System.out.println(al1.get(4));
		System.out.println(al1.get(9));
		
		//to read fullarray list
		for(int i=0;i<al1.size();i++) {
			System.out.print(al1.get(i)+" ");
		}
		System.out.println();
		
		//advanced for loop
		for(Object value:al1) {
			System.out.print(value+" ");
		}
		System.out.println();
		
		
		//cursur
		Iterator itr=al1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		
		ListIterator litr=al1.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
		}
		System.out.println();
		
		Collections.reverse(al1);
		System.out.println(al1);
		System.out.println();
		
		 Iterator itr1=al1.iterator();
		 while(itr1.hasNext()) {
			 System.out.print(itr1.next()+" ");
		 }
		 System.out.println();
	}

}
