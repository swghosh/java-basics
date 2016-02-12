import java.util.*;
public class Ascending
{
    public String toAscendingString(String str)
    {
        String str2="";
        str=str.toUpperCase();char ch=' ';
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<str.length();j++)
            {
                ch=str.charAt(j);
                if((int)ch==i)
                str2=str2+ch;
            }
        }
        return str2;
    }
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("\nEnter a word : ");
        String str=x.next();
        System.out.println("String in alphabetical order : "+toAscendingString(str));
    }
}
