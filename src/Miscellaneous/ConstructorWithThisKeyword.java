package Miscellaneous;

public class ConstructorWithThisKeyword {
	
	//class variables
	String name;
	String age;
	
	public ConstructorWithThisKeyword(String name, String age)
	{
		this.name=name;
		this.age=age;
		System.out.println(name); //local variable also has tom and 30 value.
		System.out.println(age);
		System.out.println(this.name); //global variable is also now have tom value.
		System.out.println(this.age);//global variable is also now have 30 value.
	}

	public static void main(String[] args) {
		
		ConstructorWithThisKeyword obj= new ConstructorWithThisKeyword("Tom","30");
		

	}

}
