package JavaPrograms;

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2;i<num ; i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	
	public static void getPrimeNumber(int num)
	{
		for(int i=2; i<=num ;i++)
		{
			if(isPrimeNumber(i))
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Is 3 prime?" + isPrimeNumber(3));
		getPrimeNumber(7);
	}

}
