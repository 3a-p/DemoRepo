package Miscellaneous;

public class ConstructorB extends ConstructorA{

// super keyword is used to call the parent constructor.
//super keyword if not mentioned, then default constructor of parent is called.
// super keyword always should be the 1st statement in child class constructor.	
// At a time only 1 super() keyword is called.	
	
	public ConstructorB()
	{
		//super(10);
		//super(10,20);
		System.out.println("B const");
	}
	
	public ConstructorB(int i)
	{
		super(i);
	}
	
	public ConstructorB(int i,int j)
	{
		super(i,j);
	}
	

		
	public static void main(String[] args) {
// when Child class B object is created, B constructor is called but it checks if B extends A and then A constructor is called first and then B const is called.
		ConstructorB obj = new ConstructorB();
		ConstructorB obj1 = new ConstructorB(10);
		ConstructorB obj2 = new ConstructorB(20,30);

	}

}
