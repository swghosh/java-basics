import java.util.*;
public class RecFact
{
    int n;
    int r;
    /**
     * RecFact Constructor
     *
     */
    RecFact() {
        n = 0;
        r = 0;
    }

    /**
     * Method readnum
     * reads the numbers from the user
     */
    void readnum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Value of n [int] ->");
        n = sc.nextInt();
        System.out.print("Value of r [int] ->");
        r = sc.nextInt();
    }

    /**
     * Method factorial
     *
     * @param n number whose factorial is to be calculated
     * @return the factorial of n using recursive technique
     */
    int factorial(int n) {
        if(n < 1) return 1;
        else return n * factorial(n - 1);
    }

    /**
     * Method factseries
     * calculates the value of n! / (r! * (n-r)!)
     */
    void factseries() {
        double a = 0.0;
        a = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println(n + "c" + r + " = " + a);
    }

    /**
     * Method main
     * method is executed at runtime
     * @param args Arguments
     */
    public static void main(String[] args) {
        System.out.println("REC FACT");
        RecFact rf = new RecFact();
        rf.readnum();//Reads the number from the user
        rf.factseries();//Calculates and prints the calulated value
    }
}
