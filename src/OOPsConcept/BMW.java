package OOPsConcept;

public class BMW extends Car{  // has-a relationship

	public void start()  //this method is overriding the parent start()
	{
		System.out.println("BMW---start");
	}
	
	public void theftSafety()
	{
		System.out.println("MBW---safety");
	}
}
