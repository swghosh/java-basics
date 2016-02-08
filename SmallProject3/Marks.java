/**
 * Write a description of class Marks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Marks
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        for (int i=1;i<=40;i++)
        {
            System.out.println();
            int phy,chem,bio,tot;
            System.out.println("Student no. "+i);
            System.out.print("\nEnter no. for Physics: ");
            phy=x.nextInt();
            System.out.print("\nEnter no. for Chemistry: ");
            chem=x.nextInt();
            System.out.print("\nEnter no. for Biology: ");
            bio=x.nextInt();
            tot=phy+chem+bio;
            System.out.print("\nTotal Marks of Student no. "+i+" is = "+tot);
            System.out.print("\n---------------------------------------------------");
            System.out.println();
        }
    }
}
