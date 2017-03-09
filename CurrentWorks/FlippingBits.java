// HackerRank Problem Flipping Bits
import java.io.*;
import java.util.*;

public class FlippingBits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            long num = sc.nextLong();
            System.out.println(toInt(flipBits(toBinaryBits(num))));
        }
    }
    // converts an integer to its 32 bit binary
    static boolean[] toBinaryBits(long n) {
        boolean[] bits = new boolean[32];
        int c = 32;
        while(n > 0) {
            if(n % 2 == 1) bits[--c] = true;
            else if (n % 2 == 0) bits[--c] = false;
            n = n / 2;
        }
        return bits;
    }
    // flip all the bits
    static boolean[] flipBits(boolean[] bits) {
        for(int i = 0; i < bits.length; i++) {
            bits[i] = !bits[i];
        }
        return bits;
    }
    // converts the 32 bits into an integer
    static long toInt(boolean[] bits) {
        long num = 0;
        int c = bits.length - 1;
        for(int i = 0; i < bits.length; i++) {
            long pow = (long)Math.pow(2, c - i);
            if(bits[i]) num = num + (long)(pow * 1);
            else num = num + (long)(pow * 0);
        }
        return num;
    }
}