import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PostiveNegative {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int total = arr.length;
        float numPos = 0.000f;
        int numNeg = 0;
        int numZero =0;

        for(int num: arr){
            if(num==0){
                numZero+=1;
            }
            else if(num>0){
                numPos+=1;
            }
            else if(num<0) numNeg+=1;

        }
        System.out.println(numZero);
         System.out.println(1/6);
        
        System.out.println(numPos);
        System.out.println(numNeg);
        double resPos = (double)numPos/(double)total;
        double resNeg = numNeg/total;
        double resZero = numZero/total;
        System.out.println(resPos);
        System.out.println(resNeg);
        System.out.println(resZero);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
