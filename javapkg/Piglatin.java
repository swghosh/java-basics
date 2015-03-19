import java.util.*;
public class Piglatin
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\n\t\t-----PIGLATIN CONVERTER-----\n\n\tSentence -> ");
        String str=sc.nextLine().toUpperCase();String output="";
        for(int i=1;i<=StringBased.countWords(str);i++)
        {
            String word=StringBased.wordAtPos(str,i);
            for(int j=0;j<word.length();j++)
            {
                char ch=word.charAt(j);
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    output=output+word.substring(j)+word.substring(0,j)+"AY"+" ";
                    break;
                }
            }
        }
        System.out.print("\n\t"+output.trim()+".");
    }
}