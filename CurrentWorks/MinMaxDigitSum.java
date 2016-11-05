import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxDigitSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long score = 0;
        for(long i = x; i <= y; i++) {
            score = score + minMaxScore(i);
        }
        System.out.println(score);
    }
    
    static long minMaxScore(long n) {
        long score = 0;
        String s = Long.toString(n);
        int l = 1;
        int r = s.length() - 2;
        for(int i = l; i <= r; i++) {
            int f = Integer.parseInt("" + s.charAt(i));
            int x = Integer.parseInt("" + s.charAt(i - 1));
            int y = Integer.parseInt("" + s.charAt(i + 1));
            if(isMin(f, x, y) || isMax(f, x, y)) score++;
        }
        return score;
    }
    
    static boolean isMin(int n, int x, int y) {
        return (n < x && n < y);
    }
    
    static boolean isMax(int n, int x, int y) {
        return (n > x && n > y);
    }
}