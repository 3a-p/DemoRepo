package JavaPart2;

public class Wrapper {

	public static void main(String[] args) {
		
		String i="100";
		System.out.println(i+10);
		
		// convert this string 100 to integer 100 using Integer Wrapper class
		
		int x=Integer.parseInt(i);
		System.out.println(x+20);
		
		// wrapper classes are like Integer, Double, Boolean which can convert string type to respective ones.
		
		String n="12.33";
		double y=Double.parseDouble(n);
		System.out.println(y+10);
		
		String k="true";
		boolean z=Boolean.parseBoolean(k);
		System.out.println(z);
		
		// how to convert integer to string
		
		int m=400;
		
		String c=String.valueOf(m);
		System.out.println(c+40);
		
		
		String j="100AB";
		int p =Integer.parseInt(j);
		System.out.println(p);  // you will get NUMBER FORMAT exception because 100AB cannot be converted to integer.
		
	}

}
