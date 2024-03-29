package ArrayList;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable h =new Hashtable();
		h.put("A", "city");
		h.put("B", "name");
		
		System.out.println(h.size());
		h.put(1, 100);
		h.put(2, 200);
		h.put(3,"papiya");
		//h.put(A, 'c'); this does not work
		System.out.println(h.size());
		
		System.out.println(h.get(3));
		
		//we have integer,Integer key value pair
		
		Hashtable<Integer,Integer> h2= new Hashtable<Integer,Integer>();
		h2.put(1, 10);
		System.out.println(h2.get(1));
		
		//we have integer,String key value pair
		Hashtable<Integer,String> h3= new Hashtable<Integer,String>();
		h3.put(1, "place");
		System.out.println(h3.get(1));
		
		
		
		
		

	}

}
