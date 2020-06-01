/*** Program illustrating NaN (Not a number) concepts
 * @author Swetha Argekar
 *  Imp: NaN is produced when an operation on double yields undefined result.
 *  1. any operation on NaN yields NaN
 *	2. NaN (<=,>=,<,>,==) with NaN/non NaN => always false
 *	3. NaN (!=) NaN/Non NaN => yields true
 *	4. 0/0 - arithmetic exception
 *	   0.0/0 - NaN
 *	   2.0/0.0 - infinity
 *	4. isNaN() - method which checks if number is NaN
 */
public class NanConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("0.0/0 is " + 0.0/0);
		System.out.println("0.0/0.0 is " + 0.0/0.0);
		System.out.println("2.0/0.0 is " + 2.0/0.0);
		System.out.println("2.0/0 is " + 2.0/0);
		
	

	}

}
