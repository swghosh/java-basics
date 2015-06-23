
/**
 * Write a description of class sum10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class sum10
{
    public double part(int n,int a)
    {
        double part=Math.pow(n,n)/Math.pow(a,n-1);
        return part;
    }
    public void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter for n: ");
        int n=s.nextInt();
        System.out.print("Enter for a: ");
        int a=s.nextInt();
        double S=1;
        for (int i=2;i<=n;i++)
        S=S+part(i,a);
        System.out.println("Sum of series = "+S);
    }            
}
