import java.util.*;
public class Sentence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("SENTENCE");
        System.out.print("Sentence [string] ->");
        String str=sc.nextLine();
        char punc=' ';
        if(str.indexOf('.')>0)
        {
            str=str.substring(0,str.indexOf('.'));
            punc='.';
        }
        else if(str.indexOf('?')>0)
        {
            str=str.substring(0,str.indexOf('?'));
            punc='?';
        }
        else if(str.indexOf('!')>0)
        {
            str=str.substring(0,str.indexOf('!'));
            punc='!';
        }
        sc.close();
        sc=new Scanner(System.in);
        System.out.print("Word to delete [string] ->");
        String word=sc.next();
        sc.close();
        sc=new Scanner(str);
        String output="";
        sc.useDelimiter(" ");int ctr=0;int k=0;
        while(sc.hasNext())
        {
            String part=sc.next();
            if(part.equals("")) continue;
            ctr++;
            if(part.equalsIgnoreCase(word)==false)
                output=output+part+" ";
            else
                k=ctr;
        }
        output=output.trim();
        System.out.println(output+((punc==' ')?"":punc));
        System.out.println("Position of word deleted= "+k);
    }
    
}