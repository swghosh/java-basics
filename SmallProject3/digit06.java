
/**
 * Write a description of class digit06 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class digit06
{
    public void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("\nEnter a no.: ");
        int n=s.nextInt();
        int ctr=0;
        for (int i=n;i>0;i=i/10)
        {
            ctr=ctr+1;
        }
        System.out.println("No. of Digits= "+ctr);
    }
}
