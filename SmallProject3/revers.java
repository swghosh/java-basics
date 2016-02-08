import java.util.*;
public class revers
{
    public String rev(String str)
    {
        int l=str.length();l--;String rev="";
        char ch=' ';
        for (int i=l;i>=0;i--)
        {
            ch=str.charAt(i);
            rev=rev+ch;
        }
        return rev;
    }
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("\nEnter a sentence: ");
        String s=x.nextLine(),word="";char ch=' ';
        int l=s.length();l--;
        for(int i=l;i>=0;i--)
        {
            ch=s.charAt(i);
            if (Character.isWhitespace(ch)==false)
            {
                word=word+ch;
            }
            else
            {
                System.out.print(rev(word)+" ");
                word="";
            }
        }
        System.out.print(rev(word));
    }
}
