import java.util.*;
public class Sentence
{
    /**
     * Method main
     * method is executed at runtime
     * @param args Arguments
     */
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("SENTENCE");
        System.out.print("Sentence [string] ->");
        String str=sc.nextLine();//user input string
        char punc=' ';
        if(str.indexOf('.')>0)//checks whether string ends in punctuation mark or not
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
        String word=sc.next();//user input word to delete from string
        sc.close();
        sc=new Scanner(str);//scanner object on input string to pass words as tokens
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
        System.out.println("Position of word deleted= "+k);//prints position of word deleted
    }
    
}