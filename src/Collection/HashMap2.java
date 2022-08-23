package Collection;

import java.util.HashMap;
import java.util.Map.Entry;



public class HashMap2 {
	
public static void main(String args[]) {
		
		//declaration of hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//adding values to hashmap
		hm.put(101,"ABC");
		hm.put(102,"LMN");
		hm.put(103, "PQR");
		hm.put(104,"ABC");
		hm.put(105,null);
		hm.put(null,"ABC");
		
		
		System.out.println(hm);
		
				
		//adding duplicate keys
		
		hm.put(101,"ABC");
		hm.put(105,null);
		System.out.println(hm);
	


//advanced for loop

//advanced for loop
//		for(Object value:hm) {
//			System.out.print(value+" ");
//		}
//		System.out.println();
		
  
		
		//how to fetch values from hashmap
		for(Entry m:hm.entrySet()) {
			System.out.print(m.getKey()+" "+m.getValue()+" ");
		}
		
}
			
}
