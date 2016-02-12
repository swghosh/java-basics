package xamprep;
import java.util.*;
/**
 * Write a description of class primeno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class primeno
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("\nEnter a no.: ");
        int n=x.nextInt();int ctr=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            ctr=ctr+1;
        }
        if (ctr==2)
        System.out.print("\nPrime no.");
        else
        System.out.print("\nNot Prime no.");
    }
}
