
/**
 * Write a description of class digit08 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class digit08
{
    public boolean isEndDigit5(int n)
    {
        boolean flag=false;
        if (n%10==5)
        flag=true;
        return flag;
    }
    public void main()
    {
        Scanner s=new Scanner(System.in);
        for (int i=1;i<=20;i++)
        {
            System.out.print("\nEnter a no.: ");
            int n=s.nextInt();
            if (isEndDigit5(n))
            System.out.println(n);            
        }
    }
}
