
public class StringBased
{
    public static String wordAtPos(String str,int pos)
    {
        str=str.trim();
        if(str.charAt(str.length()-1)=='.')
        str=str.substring(0,str.length()-1);
        str=" "+str+" ";int ctr=0;String word="";
        for(int i=0;i<str.length();i++)
        {
            if(Character.isWhitespace(str.charAt(i)))
            {
                word=str.substring(i);//substring of str from i
                word=word.substring(1);//removes leading space
                word=word.substring(0,word.indexOf(" "));//word takes in only the current word from the remaining sentence
                word.trim();//trims any leading and or trailing spaces from the word (if any)
                ctr++;
                if(ctr==pos)
                break;//breaks the loop when asked word is reached
            }
        }
        return word;
    }
    public static int countWords(String str)
    {
        str=str.trim();
        if(str.charAt(str.length()-1)=='.')
        str=str.substring(0,str.length()-1);
        str=str+" ";int ctr=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isWhitespace(str.charAt(i)))
            {
                ctr++;
            }
        }
        return ctr;
    }
}
