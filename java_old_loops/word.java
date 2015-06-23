import java.util.*;
public class word
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("\nEnter a Sentence: ");
        String str=x.nextLine();
        int l=str.length();char ch=' ';String word="";
        for(int i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if (Character.isWhitespace(ch)==false)
            System.out.print(ch);
            else if (Character.isWhitespace(ch)==true)
            System.out.println();
        }
    }
}
