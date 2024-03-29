package JavaPart2;

public class JavaMethods {

	public static void main(String[] args) {
		
	JavaMethods jm=new JavaMethods(); //new JavaMethods(); is the object and jm is the object reference.
	
	// only non static methods needs to be called using object reference
	
		jm.test();
		
		int x=jm.abc();
		System.out.println(x);
		
		String y=jm.pqr();
		System.out.println(y);
		
		int e=jm.input(10, 20);
		System.out.println(e);
		
		
		

	}
	
	// below all the functions here are non static.
	// function 1 type is void
	
	public void test() {
		System.out.println("selenium");
	}
	
	
	//function 2nd type is no input but having return output
	
	public int abc() {
		
		int a=10;  //local variable which can be accessed within a method.
		int b=20;
		int c=a+b;
		return c;
	}
	
	public String pqr() {
		
		String s="method";
		return s;
		
	}
	//function 3rd is input is there and return output
	public int input(int a, int b) {
		int z=a+b;
		return z;
	}

}
