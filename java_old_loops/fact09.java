
/**
 * Write a description of class fact09 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class fact09
{
   public long factorial(int n)
   {
        long fact=1;
        for (int i=1;i<=n;i++)
        fact=fact*i;
        return fact;
   }
   public void main()
   {
       Scanner x=new Scanner(System.in);
       long sum=0;
       for (int i=1;i<=10;i++)
       {
           System.out.print("\nEnter a no.: ");
           int n=x.nextInt();
           sum=sum+factorial(n);
       }
       System.out.println("Sum of Factorials = "+sum);
   }
}
