import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProgressionCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b[] = new int[n];
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[][] power = powerSet(b);
        int A = 0;
        for(int i = 0; i < power.length; i++) {
            if(isAP(power[i])) {
                A++;
            }
        }
        System.out.println(A % (Math.pow(10, 9) + 9));
    }
    
    public static boolean isAP(int[] b) {
        if(b.length == 0 || b.length == 1 || b == null) return true;
        int D = b[1] - b[0];
        boolean flag = true;
        for(int i = 1; i < b.length; i++) {
            int diff = b[i] - b[i - 1];
            if(diff != D) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    
    public static int[][] powerSet(int[] b) {
        int size = (int)Math.pow(2, b.length);
        int[][] power = new int[size][];
        int[][] p = {{}, {2}, {4}, {2}, {2,4}, {4,2}, {2,2}, {2,4,2}};
        return p;
    }
}