import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
   BigInteger a = new BigInteger(sc.next());
   BigInteger b = new BigInteger(sc.next());
    BigInteger c,d;
    c = a.add(b);
    d =a.multiply(b);
    System.out.println(c);
    System.out.println(d);
    }
    
}
