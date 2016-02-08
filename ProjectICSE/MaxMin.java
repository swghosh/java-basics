import java.util.*;
public class MaxMin
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("\nEnter a Sentence/String : ");
        String str=x.nextLine();
        if(str.charAt(str.length()-1)!='.')
        {
            System.out.print("\nInvalid Input. Expected fullstop ('.') not found..\nPlease Retry;-)\n\n\n");
            main();
        }
        str=str.substring(0,str.length()-1)+" ";
        int max=0,min=str.length();String word="",w1="",w2="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            word=word+ch;
            if(Character.isWhitespace(ch)==true)
            {
                int l=word.trim().length();
                if(l>max)
                {
                    max=l;
                    w1=word;
                }
                if(l<min)
                {
                    min=l;w2=word;
                }
                word="";
            }
        }
        System.out.println("Word with maximum length = "+w1+"\nWord with minimum length = "+w2);
    }
}
