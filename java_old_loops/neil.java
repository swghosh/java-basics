
/**
 * Write a description of class neil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class neil
{
    public static void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("------MENU------");
        System.out.println("1: For no. loop");
        System.out.println("A: For upper case alphabet loop");
        System.out.println("a: For lower case alphabet loop");
        System.out.print("\nEnter your choice: ");
        String a=s.next();
        System.out.println();
        char ch=a.charAt(0);
        if (ch=='1')
        {
            for(int i=1;i<=9;i++)
            {
                for (int j=i;j>=1;j--)
                System.out.print("\t"+j);
                System.out.println();
            }
        }
        else if (ch=='a')
        {
            for (int i=97;i<=122;i++)
            {
                for (int j=i;j>=97;j--)
                System.out.print("\t"+(char)(j));
                System.out.println();
            }
        }
        else if (ch=='A')
        {
            for (int i=65;i<=90;i++)
            {
                for (int j=i;j>=65;j--)
                System.out.print("\t"+(char)(j));
                System.out.println();
            }
        }
        else
        System.exit(0);
    }
}
