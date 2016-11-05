import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InterestingFibonnaciSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] lengths = new int[q];
        int[][] data = new int[q][];
        for(int i = 0; i < q; i++) {
            lengths[i] = sc.nextInt();
            data[i] = new int[lengths[i]];
            for(int j = 0; j < data[i].length; j++) {
                data[i][j] = sc.nextInt();
            }
        }
        for(int d[] : data) {
            System.out.println(G(d));
        }
    }
    
    static int[] range(int x, int y) {
        if(x > y) {
            int temp = y;
            y = x;
            x = temp;
        }
        int c[] = new int[y - x + 1];
        int j = 0;
        for(int i = x; i <= y; i++) {
            c[j++] = i;
        }
        return c;
    }
    
    static int sum(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
    
    static int fibonnaci(int n) {
        if(n < 2) {
            return n;
        }
        else {
            return fibonnaci(n - 1) + fibonnaci(n - 2);
        }
    }
    
    static int F(int x, int y) {
        return fibonnaci(sum(range(x, y))) % (int)(Math.pow(10, 9) + 7);
    }
    
    static long G(int[] A) {
        int q = (A.length * (A.length + 1)) / 2;
        int[][] ranges = new int[q][2];
        int ctr = 0;
        for(int i = 0; i < A.length; i++) {
            int x = A[i];
            for(int j = i; j < A.length; j++) {
                int y = A[j];
                ranges[ctr][0] = x;
                ranges[ctr++][1] = y;
            }
        }
        long sum = 0;
        for(int i = 0; i < ranges.length; i++) {
            sum = sum + F(ranges[i][0], ranges[i][1]);
        }
        return sum;
    }
}