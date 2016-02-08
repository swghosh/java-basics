/*
 * Program to input 2 numbers x, y from user
 * Convert x, y to all possible bases from 2 to 20
 * eg. (12) base 2 = 1100
 * eg. (5) base 4 = 1;
 * eg. (74) base 15 = 4E;
 * Print all possible similarities when (x) base i = (y) base j
 * i,j iterates from 2 to 20
 * Copyright (C) SwG Ghosh! 
 * dt.27/11/2015
 */

import java.util.Scanner;

public class NumberBaseIterator {

    /**
     * Method getInt
     * Converts digits 0-9,A-J into their respective integral values
     */
    static int getInt(char ch) throws NumberFormatException {
        String str = "" + ch;
        int val=0;
        try {
            if(Integer.parseInt(str) >= 0) {
                val = Integer.parseInt(str);
            }
        }
        catch (NumberFormatException nfe) {
            int i=10;
            for(char ch1 = 'A'; ch1 <= 'J';ch1++, i++) {
                if(ch == ch1) {
                    val = i;
                    break;
                }
            }
        }
        return val;
    }

    /**
     * Method toDecimal
     * Converts a number to its decimal form (base 10)
     * eg. "110" base 2 yields 6
     */
    static int toDecimal(String no, int base) {
        int n = 0;
        int limit = no.length();
        for(int i = 0, j = limit - 1;i < limit;i++, j--) {
            int f = getInt(no.charAt(i));
            n = n + (f * (int)Math.pow(base, j));
        }
        return n;
    }

    /**
     * Method getChar
     * Converts 0-9 to character 0-9
     * Converts A-J to 10-19
     */
    static char getChar(int n) {
        char ch = '\0';
        if(n >= 0 && n <= 9) {
            ch = Integer.toString(n).charAt(0);
        }
        else {
            ch = (char)(65 + n - 10);
        }
        return ch;
    }

    /**
     * Method toBase
     * Converts a number to its respective base
     * eg. 6 into base 2 yields "110"
     */
    static String toBase(int n, int base) {
        String no = "";
        while(n > 0) {
            no = getChar(n % base) + no;
            n = n / base;
        }
        return no;
    }

    /**
     * Method main
     * Method to be executed at runtime 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---NUMBER BASE ITERATOR---");
        System.out.print(" Integer 1 -> ");
        int n1 = sc.nextInt();
        System.out.print(" Integer 2 -> ");
        int n2 = sc.nextInt();
        sc.close();
        for(int i = 2; i <= 20; i++) {
            for(int j = 2; j <= 20; j++) {
                String no1 = toBase(n1, i);
                String no2 = toBase(n2, j);
                if(no1.equals(no2)) {
                    System.out.println(n1 + " raised to base " + i + " = " + n2 + " raised to base " + j);
                }
            }
        }
    }

}
