package JavaPart2;

public class StaticAndNonStaticMethods {
	
	static int age=25;  //static global variable
	String name="papiya"; //non-static global variable

	public static void main(String[] args) {
		
		// how to access non static method/variables only using object references.
		
		System.out.println("Non-static");
		
		StaticAndNonStaticMethods obj=new StaticAndNonStaticMethods();
		System.out.println(obj.name);
		obj.testing();

		// how to access static method/variables?
		//Object references can be used to access static variable. Java will throw warning. But it is good practice to access static members using below 2 ways.
		System.out.println("static");
		
		//1 way is to direct call static method/variable 
		System.out.println(age); 
		test();
		
		//2 way is to use class name
		System.out.println(StaticAndNonStaticMethods.age); 
		StaticAndNonStaticMethods.test();
		
		
		
	}

	public static void test()
	{
		System.out.println("this is test method");
	}
	
	public void testing() {
		System.out.println("this is a testing method");
	}
}
