/*
 * Swarup Ghosh
 * Class XII A
 * ISC 2017 Practice for Computer Practical
 * 17.01.2017
*/
import java.util.Scanner;
class EvilNumberTester {
    // main method to be executed at runtime
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT : ");
        int n = sc.nextInt();
        // validation of the number
        if(n > 0 == false) {
            System.out.println("INVALID INPUT");
            return;
        }
        long bin = toBinary(n); // returns the given number's binary equivalent
        // also prints number of 1s
        System.out.println("BINARY : " + bin);
        if(isEvilNumber(bin)) {
            System.out.println("OUTPUT : EVIL NUMBER");
        }
        else {
            System.out.println("OUTPUT : NOT AN EVIL NUMBER");
        }
    }
    
    // checks whether given binary number is evil or not
    static boolean isEvilNumber(long bin) {
        int counter = 0;
        long temp = bin;
        while(temp > 0) {
            int digit = (int)temp % 10; // each binary digit iterated
            if(digit == 1) counter++;
            temp = temp / 10;
        }
        System.out.println("NO. OF 1s : " + counter);
        return (counter % 2 == 0); // counter even or not
    }
    
    // converts a number to its binary equivalent
    static long toBinary(int n) {
        int temp = n;
        String bin = ""; // will store the binary number
        while(temp > 0) {
            int ex = temp % 2;
            bin = Integer.toString(ex) + bin;
            temp = temp /2;
        }
        return Long.parseLong(bin); // binary equivalent as long
    }
} // end of class