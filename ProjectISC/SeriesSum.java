import java.util.*;
public class SeriesSum
{
    int x;
    int n;
    double sum;
    /**
     * SeriesSum Constructor
     *
     * @param xx assigns data member x its value
     * @param nn assigns data member n its value
     */
    SeriesSum(int xx, int nn) {
        x = xx;
        n = nn;
        sum = 0;
    }

    /**
     * Method findfact
     *
     * @param m the number whose factorial is to be calculated
     * @return the factorial of m using recursive technique
     */
    double findfact(int m) {
        if(m < 2) return m;
        else return m * findfact(m - 1);
    }

    /**
     * Method findpower
     *
     * @param b base
     * @param n power
     * @return base b raised to the power n
     */
    double findpower(int b, int n) {
        if(n < 2) return b;
        else return b * findpower(b, n - 1);
    }
    
    /**
     * Method calculate
     *
     */
    void calculate() {
        for(int i = 2; i <= n; i++) {
            sum = sum + (findpower(x, i) / findfact(i - 1));
        }
    }

    /**
     * Method display
     *
     */
    void display() {
        System.out.println("Sum of series = " + sum);
    }

    /**
     * Method main
     * method is executed at runtime
     * @param args Arguments
     */
    public static void main(String args[]) {
        System.out.println("SERIES SUM");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nValue of x [int] ->");
        int x = sc.nextInt();
        System.out.print("\nValue of n [int] ->");
        int n = sc.nextInt();
        SeriesSum ss = new SeriesSum(x, n);
        ss.calculate();//calculates the series sum
        ss.display();//prints the series sum
    }
}
