/***
Lexicographical Order : also known as alphabetic or dictionary order, orders characters as follows:
eg: ball < cat, dog < dorm, Happy < happy, Zoo < ball.

substring of a string: contiguous block of characters in the string. 
eg: the substrings of abc are a, b, c, ab, bc, and abc.

Ques:Given a string, , and an integer, , complete the function so that it finds the lexicographically 
smallest and largest substrings of length .

Input Format:
The first line contains a string denoting .
The second line contains an integer denoting .

Constraints: consists of English alphabetic letters only (i.e., [a-zA-Z]).

Output Format:
Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

Sample Input 0 : welcometojava
				 3
Sample Output 0: ava
				 wel
Explanation:
String  has the following lexicographically-ordered substrings of length : 


We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
 * 
 */


import java.util.Scanner;
public class LexicalSubstring {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		int index=0;

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		String[] strArr = new String[s.length()-k+1];

		for ( int i=0;i<strArr.length;i++){
			String str = s.substring(i,i+k);
			strArr[i] = str;

		}
		for(int i=0;i<strArr.length-1;i++){
			for(int j=i+1;j<strArr.length;j++){
				if (strArr[i].compareTo(strArr[j])>0){
					String temp = strArr[i];
					strArr[i]=strArr[j];
					strArr[j]=temp;    
				}
			}
		}
		smallest =strArr[0];
		largest = strArr[strArr.length-1];
		return smallest + "\n" + largest;
	}
}

