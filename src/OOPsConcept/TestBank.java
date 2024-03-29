package OOPsConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hb=new HSBCBank();
		hb.credit();  //overidden methods
		hb.debit(); //overidden methods
		hb.transfer();//overidden methods
		hb.educationLoan(); //own method
		hb.carLoan();//own method
		hb.mutualFund();  //brazil bank method can be accessed now using child class object reference.
		
		//dynamic polymorphism
		
		//child class object is being referenced by parent class object reference/reference variable
		USbank ub=new HSBCBank();
		ub.credit();  //overriden methods so cab be accessed by parent object reference
		ub.debit();//overriden methods so cab be accessed by parent object reference
		ub.transfer();//overriden methods so cab be accessed by parent object reference
		
	//	ub.educationLoan(); cannot access this as this is own method of HSBCBank
	// 	ub.carLoan(); cannot access this as this is own method of HSBCBank
		
		//how to access the static variable defined in the interface?
		// by using the ineterfaceName.staticvariable
		
		System.out.println(USbank.balance);
		//USbank.balance=200; static variable cannot be modified.
		
		
		
	}

}
