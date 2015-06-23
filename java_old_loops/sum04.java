
/**
 * Write a description of class sum04 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class sum04
{
    public int sum(int n)
    {
        int d=0;
        for (int i=1;i<=n;i++)
        d=d+i;
        return d;
    }
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("\nEnter for n i.e. term limit of series: ");
        int n=x.nextInt();
        int S=0;
        for (int i=1;i<=n;i++)
        S=S+sum(i);
        System.out.println("Sum of Series="+S);
    }
}
