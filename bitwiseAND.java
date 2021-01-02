import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int t = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int a0 = 0; a0 < t; a0++){
        int n = in.nextInt();
        int k = in.nextInt();  
        int finalResult = 0;
        for(int i = 1; i < n ; i++){
            for(int j = i+1; j <= n ; j++){
                int amp = i&j;
                if(amp < k && amp > finalResult)
                    finalResult = amp;                    
            } 
        } 
        System.out.println(finalResult);
    }
    
    }  
}
