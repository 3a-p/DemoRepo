package Miscellaneous;

public class ConstructorA {
	
	public ConstructorA() {
		System.out.println("A class const");
	}
	
	public ConstructorA(int i) {
		System.out.println("A const with value:" +i);
	}

	public ConstructorA(int i,int j) {
		System.out.println("A const with value of i:" +i);
		System.out.println("A const with value of j:" +j);
	}

}
