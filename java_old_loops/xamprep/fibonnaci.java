package xamprep;
import java.util.*;
/**
 * Write a description of class fibonnaci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fibonnaci
{
    Scanner x=new Scanner(System.in);
    public void main()
    {
        int n1=0,n2=1,n3=0;
        System.out.print("\nEnter for n i.e. term limit of series: ");
        int n=x.nextInt();
        System.out.println();
        System.out.print(n1+" "+n2+" ");
        for (int i=1;;i++)
        {
            n3=n2+n1;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
