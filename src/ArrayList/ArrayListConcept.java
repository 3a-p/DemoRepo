package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		//dynamic arraylist 
		//1. can contain duplicate values
		//2. maintains insertion order
		//3. synchronized
		//4. allows random access to fetch elements because it stores values on the basis of indexes. 
		
		
		
		
		
		ArrayList ar = new ArrayList();
		ar.add(100); //saving by index 0
		ar.add(200); //index 1
		ar.add(400); //index 2
		ar.add(500); //index 3
		
		System.out.println(ar.size());
		
		ar.add("city"); //4
		ar.add('c'); //5
		ar.add(12.33); //6
		ar.add(true); //7
		System.out.println(ar.size());
		
		System.out.println(ar.get(7));
		
		// print all the elements of this arraylist
		
		for(int i=0 ; i<ar.size() ;i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("****Int****");
		// to store data of specific type
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		System.out.println(a.get(1));
		
		System.out.println("***Double*****");
		//to store double type of data
		
		ArrayList<Double> a1 = new ArrayList<Double>();
		a1.add(12.33);
		a1.add(13.44);
		System.out.println(a1.get(1));
		
		System.out.println("***String*****");
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("place");
		a2.add("name");
		
		System.out.println(a2.get(1));
		
		a2.remove(1);  // to remove
		System.out.println(a2.get(0));
		
		System.out.println("***using addAll()****");
		ArrayList<String> a4 = new ArrayList<String>();
		a4.add("India");
		a4.add("Japan");
		a4.add("Indonesia");
		a2.addAll(a4); // this will append a4 into a2 array list
		
		for(int i=0 ;i<a2.size();i++)
		{
			System.out.println(a2.get(i));
		}
		
		
		// how to call user defined Employee class objects using ArrayList
		
		Employee e1= new Employee("Papiya",31,"QA");
		Employee e2= new Employee("Tom",32,"Dev");
		Employee e3= new Employee("Peter",33,"Admin");
		
		//create ArrayList and storing the above e1,e2, e3 object references inside it
		
		ArrayList<Employee> a3= new ArrayList<Employee>();
		
		a3.add(e1); 
		a3.add(e2);
		a3.add(e3);
		
		//Iterator to traverse the values
		
		Iterator<Employee> it =a3.iterator(); // this creates the Iterator of type Employee.
		
		//now , cannot use for loop to print because here, values are not stored in the form of indexes. Iterator we use while loop.
		
		while(it.hasNext())
		{
		 Employee emp=it.next(); // this will point to the 1st e1 object reference.That e1 needs to be stored into emp.
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
		}
		
		
		
		
	}

}
