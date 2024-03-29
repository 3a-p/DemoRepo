package JavaPart2;

public class Objects {
	
	int mod;
	int wheel; //global variable /class variable. To access this, need to create object of this class.
	
	//always remember that global variable and non static methods are always accessed using object reference.
	//only  Main Method is static so separate memory is assigned to that. It can be accessed by any object reference.But you will get warning when you try to access it. It is not a good practice to access static methods/variables with object reference.
	//static methods are never part of object.It is freely available inside the java memory. No need to access it using any object reference.

	public static void main(String[] args) {
		
		Objects o =new Objects(); // new Objects() this is the object and 'o' is the object reference
		Objects p =new Objects();
		Objects q =new Objects();
		
		o.mod=2;
		o.wheel=4;
		
		p.mod=10;
		p.wheel=25;
		
		q.mod=7;
		q.wheel=21;
		
		System.out.println(o.mod);
		System.out.println(o.wheel);
		
		System.out.println(p.mod);
		System.out.println(p.wheel);
		
		System.out.println(q.mod);
		System.out.println(q.wheel);
		

	}

}
