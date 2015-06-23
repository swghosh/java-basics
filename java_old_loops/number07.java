
/**
 * Write a description of class number07 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class number07
{
    public boolean isPositive(int n)
    {
        boolean flag=false;
        if (n>0)
        flag=true;
        return flag;
    }
    public boolean isNegative(int n)
    {
        boolean flag=false;
        if (n<0)
        flag=true;
        return flag;
    }
    public void main()
    {
        Scanner s=new Scanner(System.in);
        int pos=0,neg=0;
        for (int i=1;i<=20;i++)
        {
            System.out.print("\nEnter a no.: ");
            int n=s.nextInt();
            if (isPositive(n))
            pos=pos+1;
            else if (isNegative(n))
            neg=neg+1;
        }
        System.out.println("No. of Positive no.s = "+pos);
        System.out.println("No. of Negative no.s = "+neg);
    }
}
