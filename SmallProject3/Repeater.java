import java.util.*;
public class Repeater
{
    public int countWords(String str)
    {
        str=str.trim()+" ";int ctr=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isWhitespace(str.charAt(i)))
            ctr++;
        }
        return ctr;
    }
    public String wordAtPos(int n,String str)
    {
        str=" "+str.trim()+" ";
        int ctr=0;
        String word="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isWhitespace(ch))
            ctr++;
            if(ctr==n){
            word=str.substring(i);
            break;}
        }
        word=word.substring(1);
        word=word.substring(0,word.indexOf(" "));
        word=word.trim();
        return word;
    }
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("\nEnter a string/sentence: ");
        String str=x.nextLine();String word="",output="";
        for(int i=1;i<=countWords(str);i++)
        {
            int ctr=0;
            word=wordAtPos(i,str);
            for(int j=1;j<=countWords(str);j++)
            {
                if(i==j)
                continue;
                if(word.equalsIgnoreCase(wordAtPos(j,str)))
                {
                    ctr++;
                }
            }
            if(ctr>=1)
            output=output+word+"\n";
        }
        System.out.println("Repeated:\n"+output);
    }
}
