package Miscellaneous;

public class finallyConcept {

// finally block will always execute even if exception is there or not.
// finally block is used to put the close DB connection, driver.quite() so that it will always execute even after exception.

	public static void main(String[] args) {
		
		//test1();
		division();
		//test2();
	}
	
	public static void test1()
	{
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
			
		}
		catch(Exception e)
		{
			System.out.println("inside catch block");
		}
		finally {
			System.out.println("inside finally block");
		}
	}
	
	public static void test2()
	{
		try {
			System.out.println("inside try block");
		}
		finally {
			System.out.println("finally block");
		}
	}
	
	public static void division()
	{
		int i=10;
		try {
			System.out.println("inside try block");
			int k=i/0;
		}
		catch(NullPointerException e)
		{
			System.out.println("inside catch block");
			System.out.println("divide by zero");
			
		}
		finally 
		{
			System.out.println("finally even after exception");
		}
		
	}

}
