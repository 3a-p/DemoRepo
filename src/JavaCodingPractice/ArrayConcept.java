package JavaCodingPractice;

public class ArrayConcept {

	public static void main(String[] args) {
		// static array
		
		//static Array is a array variable that holds a specific size of the array
		// static Array can be of four data types : int, double, string, char, boolean
		// static array can hold data of similar data types only. 
		
		int i[]=new int[4]; //size of array is 4, starting from lowest index 0 to highest index 3.
		
		//how to assign values to this array
		
		i[0]=20;
		i[1]=30;
		i[2]=40;
		i[3]=50;
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		// print all elements of this array
		
	System.out.println(i.length);  //length of the array
	
	for(int j=0;j<i.length;j++)
	{
		System.out.println("Array contains elements as "+i[j]);
	}
	
	double a[]=new double[4];
	a[0]=12.11;
	a[1]=11.11;
	a[2]=15.11;
	a[3]= 16.11;
	System.out.println(a[3]);
	
	char b[]=new char[3];
	b[0] ='a';
	b[1]='b';
	b[2]='c';
	
	System.out.println(b[2]);	
			
			
	String c[]=new String[4];
	
	c[0]="papiya";
	c[1]="test";
	c[2]="Bangalore";
	c[3]="Ranka";
		
	System.out.println(c[3]);	
	
	
	boolean d[]=new boolean[2];
	
	d[0]=true;
	d[1]=false;
		
	
	System.out.println(d[1]);
		
	// limitations of static array :
	// 1. similar data types only can be stored in static array , in order to avoid this problem , you can use object array.
	// 2. size of the array is fixed initially, in order to avoid this we can use collections Arraylist, HashTable--use dynamic array
	
	Object x[]= new Object[5];
	
		x[0]=10;
		x[1]=23.44;
		x[2]="papiya";
		x[3]='s';
		x[4]=true;
		
				
		for(int j=0;j<x.length;j++)
		{
			System.out.println("Array contains elements as "+x[j]);
		}
		
		
		// 2D Array contains rows and columns
		String s[][]=new String[3][5];
		
		// total rows of this 2D
		System.out.println(s.length); 
		//total columns of this 2D
		System.out.println(s[0].length); 
		
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="C";
		s[0][3]="D";
		s[0][4]="E";
		
		s[1][0]="F";
		s[1][1]="G";
		s[1][2]="H";
		s[1][3]="I";
		s[1][4]="J";
		
		s[2][0]="K";
		s[2][1]="L";
		s[2][2]="M";
		s[2][3]="N";
		s[2][4]="O";
		
		for(int row=0 ;row<s.length ; row++)
		{
			for(int column=0 ; column<s[0].length;column++)
			{
				System.out.println("elements of 2D array are as follows"+s[row][column]);
			}
		}
		
		
		
		
		
		
		
		

	}

}
