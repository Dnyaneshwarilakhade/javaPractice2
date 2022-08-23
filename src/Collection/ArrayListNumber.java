package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListNumber {
  
	public static void main(String[]args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<String>str=new ArrayList<String>();
		
		al.add(10);
		al.add(20);
		al.add(100);
		al.add(144);
		al.add(45);
		al.add(6);
		al.add(10);
		
		System.out.println(al);
		
		str.add("Sachhit");
		str.add("duggu");
		str.add("Nano");
		str.add("life");
		
		System.out.println(str);
		
		//String arraylist before sorting
		System.out.println("before sorting"+str);
		
		Collections.sort(str);
		System.out.println(str);
		
		Collections.sort(str,Collections.reverseOrder());
		System.out.println(str);
		
		//number arraylist before sorting
		System.out.println("before sorting:"+al);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		//loop
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		
		//listiterator
		ListIterator litr=str.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
		}
		System.out.println();
	}
}
