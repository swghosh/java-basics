
/**
 * Test whether a number is Evil number or not
 * 
 */

import java.util.Scanner;

public class EvilNumber {
    
    /**
     * Method isEvilNumber
     *
     * @param n number to be tested
     * @return whether n is an evil number or not
     */
    static boolean isEvilNumber(int n) {
        String binary = NumberBaseIterator.toBase(n, 2);
        int ctr = 0;
        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') ctr++;
        }
        return (ctr % 2 == 0);
    }
    
    /**
     * Method main
     * To be executed at runtime
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number to be tested [int] -> ");
        int n = sc.nextInt();
        System.out.println((isEvilNumber(n) ? "Evil Number." : "Not an evil number."));
    }
}
