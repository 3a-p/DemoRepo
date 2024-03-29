package Miscellaneous;

public class FinalizeConcept {

//finalize is to clean up the memory. GC will destroy the objects that do not have any object reference.
// finalize non-static method will be called automatically without actually calling it using object reference inside the main block.	

	public void finalize() // before calling the GC(garbage collector), finalize will be called.
	{
		System.out.println("finalize method");
	}
	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1=null; //object reference is destroyed if declared null, but the object still stays.
		f2=null;
		
		System.gc(); // to call the garbage collector
		
//final is keyword, finally is block, finalize is method.		

	}

}
