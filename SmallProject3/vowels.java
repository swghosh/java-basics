
/**
 * Write a description of class vowels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class vowels
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("\nEnter a word/sentence: ");
        String str=x.next();
        int len=str.length();
        char ch=' ';
        for (int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o')
            System.out.print("$");
            else
            System.out.print(ch);
        }
    }
}