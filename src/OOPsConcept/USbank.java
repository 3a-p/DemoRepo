package OOPsConcept;

public interface USbank {
	
	int balance=100; // interface variables are always static and final in nature and hence values cannot be changed.
	
	public void credit();
	public void debit();
	public void transfer();
	
	//only method declaration
	//no method body
	//no main method
	//we cannot create object for interface.
	//interface is abstract in nature

}
