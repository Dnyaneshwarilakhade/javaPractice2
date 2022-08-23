package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1{
	 public static void main(String args[]) {
		 
		 //TreeSet tr=new TreeSet();
		 
		 TreeSet <String> tr=new TreeSet<String>();
		 TreeSet <Integer> tr1=new TreeSet<Integer>();
		 TreeSet <Character> tr2=new TreeSet<Character>();
		 
		 //adding the values
		 
		 tr.add("Z");
		 tr1.add(20);
		 tr.add("A");
		 tr1.add(10);
		 tr.add("PQR");
		 tr2.add('c');
		 tr2.add('a');
		 
		 System.out.println(tr);
		 System.out.println(tr1);
		 
		 System.out.println(tr2);
		 
		 for(String value:tr) {
				System.out.print(value+" ");
			}
		 System.out.println();
		 
		 
		 
		 Iterator itr=tr.iterator();
		 while(itr.hasNext()) {
			 System.out.print(itr.next()+" ");
		 }
		 
		 System.out.println();
				 
		 for(Integer value:tr1) {
				System.out.print(value+" ");
			}
		 System.out.println();
		 
		 for(Character value:tr2) {
				System.out.print(value+" ");
			}
		 
		 
	 }
	

}
