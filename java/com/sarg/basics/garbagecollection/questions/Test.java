package garbagecollection.questions;

public class Test 
{ 
	public static void main(String [] args)  
	{ 
		Test2 t1 = new Test2(); 
		Test2 t2 = m1(t1); // line 6 
		Test2 t3 = new Test2(); 
		t2 = t3; // line 8 
		t1=null;

	} 
	
	
	static Test2 m1(Test2 temp)  
	{ 
		temp = new Test2(); 
		return temp; 
	} 
	
	@Override
	protected void finalize() {
		System.out.println("Finalize called");
	}
	
	
}