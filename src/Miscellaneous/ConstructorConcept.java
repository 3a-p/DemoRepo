package Miscellaneous;

public class ConstructorConcept {
	
// constructor name should be same as class name.
// constructor does not have a return type.
// constructor is not a function, it looks like function.
// there is no return inside constructor.
// default constructor means 0 parameters.
// you can create constructor with different parameters.
	//constructor can be overloaded.As you see here.
// how to call constructor? constructor is automatically called when the object of class is created.
// hidden default constructor is always there, if you want to write a default constructor again in your class, then you can.
//but there is no hidden 1-parameter and 2-parameter default constructor, so you have to explictly define it.

// real example, when action class we create object we write like new Actions(driver); because action single parameter is the default constructor for action class.	
	
	public ConstructorConcept()
	{
		System.out.println("default constructor");
	}
	
	public ConstructorConcept(int i)
	{
		System.out.println("single param constructor");
		System.out.println("printing value of i:" +i);
	}
	public ConstructorConcept(int i, int j)
	{
		System.out.println("single param constructor");
		System.out.println("printing value of i:" +i);
		System.out.println("printing value of j:" +j);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorConcept obj=	new ConstructorConcept(); // this is calling default constructor.
		ConstructorConcept obj1=new ConstructorConcept(10); // calling the single parameter constructor.
		ConstructorConcept obj3=new ConstructorConcept(10,20); //2-parameter consructor is called.
	}

}
