import java.util.*;
public class Emirp
{
    int n;
    int rev;
    int f;
    /**
     * Emirp Constructor
     *
     * @param nn assigns n its value
     */
    Emirp(int nn) {
        n = nn;
        rev = 0;
        f = 2;
    }
    /**
     * Method isprime
     *
     * @param x the number
     * @return 1 when x is prime, 0 otherwise by using recursive technique
     */
    int isprime(int x) {
        if(f == x) return 1;
        else {
            if(x % f == 0) return 0;
            else {
                f = f + 1;
                return isprime(x);
            }
        }
    }
    /**
     * Method isEmirp
     * checks whether n is an emirp number or not
     */
    void isEmirp() {
        int temp = n;
        while(temp > 0) {
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }
        boolean flag1 = isprime(n) == 1;
        f = 2;
        boolean flag2 = isprime(rev) == 1;
        if(flag1 && flag2) {
            System.out.println("Emirp number");
        }
        else {
            System.out.println("Not Emirp number");
        }
    }
    /**
     * Method main
     * method is executed at runtime
     * @param args Arguments
     */
    public static void main(String[] args) {
        System.out.println("EMIRP NUMBER TEST");
        Scanner sc = new Scanner(System.in);
        System.out.print("Value of n [int] ->");
        Emirp e = new Emirp(sc.nextInt());
        e.isEmirp();//Checks and prints whether user input number is emirp or not
    }
}
