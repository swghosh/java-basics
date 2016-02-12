package xamprep;
import java.util.*;
/**
 * Write a description of class multitable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class multitable
{
   Scanner s=new Scanner(System.in);
   public void main()
   {
       System.out.print("\nEnter the table no.: ");
       int n=s.nextInt();System.out.println();
       for(int i=1;i<=10;i++)
       {
           System.out.println(n+"x"+i+"="+(n*i));
       }
   }
}
