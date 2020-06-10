/*** Ways to reverse string
 * 1. convert to byteArray - using getBytes() method.
 * 2. convert to charArray - using toCharArray()
 * 3. convert to charArray - but reverse only half
 * 4. convert to StringBuilder - reverse() method
 * 5. convert to ArrayList - use listiterator method
 */
package reversingstring;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringTutorial {

	public static void main(String[] args) {
		
		String input = "Swetha";
		
		/* Way 1: Convert to byteArray - using getBytes() method */
		byte[] byteArr = input.getBytes();
		byte[] revByteArr = new byte[byteArr.length];
		int len = revByteArr.length;
				
		for(int i=0;i<len;i++) {
			revByteArr[i]=byteArr[len-i-1];				
		}
		
		System.out.println("Reversed byteArray: " + revByteArr);// it will print Ascii
		System.out.println("Reversed String using byteArray: " +new String(revByteArr));
		
		
		/* Way 2: Convert to charArray */
		char[] charArr = input.toCharArray();
		char[] revCharArr = new char[charArr.length];
		
		for(int i=0;i<len;i++) {
			revCharArr[i]=charArr[len-i-1];				
		}
		
		System.out.println("Reversed String using charArray: "+ revCharArr); //address printed
		System.out.println(revCharArr);//actual array printed
		
		/* Way 3: Convert to charArray - shifting only half array */
		char[] charArr1 = input.toCharArray();
		char[] revCharArr1 = new char[charArr.length];
		
	
		for(int i=0;i<len/2;i++) {
			char temp = charArr[i];
			revCharArr1[1]=charArr[len-i-1];	
			charArr[len-i-1] = temp;
		}

		System.out.println("Reversed String using charArray (half-iteration): "+ revCharArr1);
		
		/* Method 4: using StringBuider*/
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		System.out.println("Reversed String using StringBuilder: " + sb);
		
		/* Method 5: using ArrayList*/
		ArrayList<String> arrList = new ArrayList(input);
		
		
		Collections.reverse(arrList);
		System.out.println("Reversed String using ArrayList: " + sb);
		*/
		
				
		
	
}



}
