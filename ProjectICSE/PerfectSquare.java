
/**
 * WAP to accept a no from the user and display whether perfect square or not
 * 
 * Swghosh_IX C
 * @13/7/13
 */
import java.util.*;
public class PerfectSquare
{
    public static void main(String[] args)
    {
        Scanner vc=new Scanner (System.in);
        System.out.println("Enter a no.");
        int n=vc.nextInt();
        double s=Math.sqrt(n);
        double r=s*s;
        if (n==r)
            System.out.println("Perfect Square");
        else
            System.out.println("Not a Perfect Square");
    }
}