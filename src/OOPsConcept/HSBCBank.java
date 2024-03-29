package OOPsConcept;

public class HSBCBank implements USbank,Brazil { //multiple inheritance is achieved here

// implements means "is-a" relationship
	
	
		public void credit()
		{
			System.out.println("hsbc--credit");
		}
		
		public void debit()
		{
			System.out.println("hsbc--debit");
		}

		public void transfer()
		{
			System.out.println("hsbc--transfer");
		}
		
		public void educationLoan()
		{
			System.out.println("hsbc---edu loan");
		}
		
		public void carLoan()
		{
			System.out.println("hsbc--carloan");
		}
	
		// brazil methods
		public void mutualFund()
		{
			System.out.println("Brazil---bank");
		}

}
