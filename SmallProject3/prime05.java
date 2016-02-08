
/**
 * Write a description of class Prime05 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class prime05
{
    public boolean isPrime(int n)
    {
        int ctr=0;boolean flag=false;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            ctr=ctr+1;
        }
        if (ctr==2)
        flag=true;
        return flag;
    }
    public void main()
    {
        Scanner xc=new Scanner(System.in);
        for (int i=1;i<=10;i++)
        {
            System.out.print("\nEnter a no.: ");
            int n=xc.nextInt();
            if (isPrime(n)==true)
            System.out.println("Prime: "+n);
        }
    }
}
