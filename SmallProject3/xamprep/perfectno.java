package xamprep;
import java.util.*;
/**
 * Write a description of class perfectno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class perfectno
{
   public void main()
   {
       Scanner x=new Scanner(System.in);
       System.out.print("\nEnter a no.:");
       int n=x.nextInt();int sum=0;
       for(int i=1;i<n;i++)
       {
           if(n%i==0)
           sum=sum+i;
       }
       if(sum==n)
       System.out.print("\nPerfect No.");
       else
       System.out.print("\nNot Perfect No.");       
   }
}
