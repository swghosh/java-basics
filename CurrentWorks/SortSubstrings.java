import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SortSubstrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        String[] ss = new String[1000];
        int ctr = 0;
        for(ctr = 0; ctr <= s.length() - k; ctr++) {
            ss[ctr] = s.substring(ctr, ctr + k);
        }
        for(int i = 0; i < ctr; i++)
        {
            for(int j = 0; j < ctr - i - 1; j++)
            {
                if(ss[j].compareTo(ss[j+1]) > 0)
                {
                    String temp = ss[j];
                    ss[j] = ss[j+1];
                    ss[j+1] = temp;
                }
            }
        }
        System.out.println(ss[0]); // smallest lexographicallly
        System.out.println(ss[ctr - 1]); // biggest lexographically
    }
}