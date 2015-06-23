
/**
 * Write a description of class vowels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class consonant
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("\nEnter a word: ");
        String str=x.nextLine();
        int len=str.length();
        char ch=' ';
        for (int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if ((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
            {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o')
                System.out.print(ch);
                else
                System.out.print("$");
            }
            else
            System.out.print(ch);
        }
    }
}