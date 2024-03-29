package JavaPrograms;

public class Palindrome {

	// eg. 151, 454
	public static void isPalindrome(int num)
	{
		int sum=0;
		int remainder=0;
		int t=num;
		
		while(num>0)
		{
			remainder=num%10;
			sum=(sum*10) +remainder;
			num	=num/10;
		}
		if(t==sum)
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
		
	}
	public static void main(String[] args) {
		
		isPalindrome(151);
	}

}
