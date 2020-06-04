/***
 * @author Swetha Argekar
 * Island of Isolation:- Group of objects which reference each other and not referenced by any active 
 * 						 object in the application
 * 					   - they get picked for garbage collection when System.gc() called.
 */

package garbagecollection.islandofisolation;

public class Test {
	Test i;
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();

		t1.i = t2; 
		t2.i = t1; 

		//checking references
		System.out.println("t1 is at "+ t1 + "\n" + "t2 is at "+ t2);
		System.out.println("t1.i is at "+ t1.i + "\n" + "t2.i is at "+ t2.i);

		t1 = null; //setting t1 as null
		t2 = null; //setting t2 as null

		System.gc();
	}

	protected void finalize() {
		System.out.println("Finalize called");
	}

}
