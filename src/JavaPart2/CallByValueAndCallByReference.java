package JavaPart2;

public class CallByValueAndCallByReference {
	
	//class variable
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj=new CallByValueAndCallByReference();
		int x= 30;
		int y= 50;
		
		obj.sum(x, y); // x and y values will be photocopied and passed to sum(a,b).This is call by value/pass by value.
		obj.p=10;
		obj.q=20;
		
		obj.swap(obj); //call by reference
		
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	public int sum(int a, int b)
	{
		 a=60; // x is now reassigned to 60 value
		 b=40;  // y is now reassigned to 20 value
		int c= a+b; // 100 instead of 80
		return c;
	}
	
	//call by object reference
	public void swap(CallByValueAndCallByReference t)
	{
		int temp=t.p;  //temp=10
		t.p=t.q; // p=20
		t.q=temp; //q=10
		
	}

}
