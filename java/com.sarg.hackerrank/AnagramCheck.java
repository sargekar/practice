
import java.util.Scanner;

public class AnagramCheck {

    static boolean isAnagram(String a, String b) {
       a= sortString(a.toLowerCase());
       b= sortString(b.toLowerCase());

       System.out.println(a + " "+ b);
       if (a.equals(b)){
           return true;
       }
        else 
        return false;
    }

    static String sortString(String str){
        char[] charArr = str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                int num1 = Integer.valueOf(charArr[i]);
                int num2 = Integer.valueOf(charArr[j]);
 
                char temp ;
                if(num1>num2){
                    temp =charArr[i];
                    charArr[i] =charArr[j];
                    charArr[j] = temp;
                 }
            } 
        }
        StringBuilder sortedStr = new StringBuilder();
        for (char ch : charArr){
            sortedStr.append(ch);
        }
    return sortedStr.toString();
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
