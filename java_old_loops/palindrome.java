
/**
 * Write a description of class palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class palindrome
{
    public void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("\nEnter a string: ");
        String str=s.nextLine();
        int l=str.length();l--;String rev="";
        char ch=' ';
        for (int i=l;i>=0;i--)
        {
            ch=str.charAt(i);
            rev=rev+ch;
        }
        if (rev==str)
        System.out.println("Palindrome String");
        else
        System.out.println("Not Palindrome String");
    }
}
