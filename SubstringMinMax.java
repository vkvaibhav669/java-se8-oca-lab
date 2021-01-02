import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String min = "";
        String max = "";
         max=s.substring(0,k);
     min=s.substring(0,k);

    for(int i=0; i+k<=s.length(); i++){           
        if(s.substring(i, i+k).compareTo(min)<0) min=s.substring(i, i+k);
        if(s.substring(i, i+k).compareTo(max)>0) max=s.substring(i, i+k);
    }

   
        return min + "\n" + max;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}