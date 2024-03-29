package ArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList();
		ll.add("test");
		ll.add("city");
		ll.add("place");
		ll.add("birth");
		
		System.out.println(ll);
		// add first
		ll.addFirst("papiya");
		// add last
		ll.addLast("selenium");
		
		System.out.println(ll);
		
		//get
		
		System.out.println(ll.get(3));
		
		//set means at a particular index adding a new value.
		ll.set(2, "color");
		System.out.println(ll);
		
		// remove first
		ll.removeFirst();
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
		
		// remove from specific index
		
		ll.remove(3);
		System.out.println(ll);
		
		// how to print all the values
		
		//create iterator
		System.out.println("***using iterator");
		
		Iterator<String> it =ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// using for loop
		System.out.println("***using for loop");
		
		for(int i=0; i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		// using advance for loop
		System.out.println("***using advance for loop");
		
		for(String str:ll)
		{
			System.out.println(str);
		
		}
		
		// using while loop
		System.out.println("****using while loop****");
		
		int i=0;
		while (ll.size()>i)
		{
			System.out.println(ll.get(i));
			i++;
			
		}
		
		
		
		
		

	}

}
