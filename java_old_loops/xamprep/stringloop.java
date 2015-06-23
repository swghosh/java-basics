package xamprep;
import java.util.*;
public class stringloop
{
    public void noSpace()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String sen=x.nextLine();
        String s=sen.toUpperCase();
        int l=s.length();char ch=' ';
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<=i;j++)
            {
                ch=s.charAt(j);
                if (Character.isWhitespace(ch))
                continue;
                else
                System.out.print(ch+"\t");
            }
            System.out.println();
        }
    }
    public void withSpace()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String sen=x.nextLine();
        String s=sen.toUpperCase();
        int l=s.length();char ch=' ';
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<=i;j++)
            {
                ch=s.charAt(j);
                System.out.print(ch+"\t");
            }
            System.out.println();
        }
    }
}
