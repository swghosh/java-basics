import java.util.*;
public class word2
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("\nEnter a sentence: ");
        String s=x.nextLine(),word="";char ch=' ';
        int l=s.length();l--;
        for(int i=0;i<=l;i++)
        {
            ch=s.charAt(i);
            if (Character.isWhitespace(ch)==false)
            {
                word=word+ch;
            }
            else
            {
                System.out.println(word);
                word="";
            }
        }
        System.out.println(word);
    }
}
