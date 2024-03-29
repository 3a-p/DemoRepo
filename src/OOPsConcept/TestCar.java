package OOPsConcept;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b=new BMW(); // compile time polymorphism static polymorphism where overridden concept is there, 1 to many methods like start() methods.
		
		b.start(); //At compile time,java will decide since start() method is defined in parent as well as child class, so preference will be given to the child class.
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine(); // child class object reference can access all methods of grandparent vehicle.
		
		System.out.println("***********");
		Car c=new Car();
		
		c.start(); // preference given to parent start() method
		c.stop();
		c.refuel();
		//c.theftSafety(); Car object reference cannot access child class methods in inheritance.
		c.engine();
		
		
		System.out.println("****dynamic poly*****");
		Car c1=new BMW(); //dynamic polymorphism means child class object is being referenced by parent class reference variable.
						// dynamic polymorphism is also called as top casting	
		c1.start(); // preference given to overriden child start() method
		c1.stop();
		c1.refuel();
		//c.theftSafety(); Car object reference cannot access child class methods in inheritance.
		c1.engine();
		
		//down casting is not allowed because big thing cannot fit in small thing
		//inorder to overcome this issue, you can do casting
		BMW b1=	(BMW)new Car();  //this (BMW) cast will overcome the error but still at run time it will throw "class cast exception"
		
		
		

	}

}
