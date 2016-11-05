import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HikingSelfies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int reqd = 0;
        for(int i = 1; i <= n; i++) {
            reqd = reqd + combination(n, i);
        }
        int left = Math.abs(x - reqd);
        System.out.println(left);
    }
    
    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    
    public static int factorial(int r) {
        if(r <= 0) {
            return 1;
        }
        return r * factorial(r - 1);
    }
}