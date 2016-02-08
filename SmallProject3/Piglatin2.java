import java.util.Scanner;
public class Piglatin2
{
    public String toPiglatin(String str)
    {
        str=str.toUpperCase().trim();char ch=' ';String output="";
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            output=str.substring(i)+str.substring(0,i)+"AY";break;}
        }
        return output;
    }
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("\nEnter a string of words: ");
        String str=x.nextLine();
        str=" "+str.trim()+" ";char ch=' ';String word="",output="";
        for(int i=0;i<str.length()-2;i++)
        {
            ch=str.charAt(i);
            if(Character.isWhitespace(ch))
            {
                word=str.substring(i);word=word.substring(1);
                word=word.substring(0,word.indexOf(' '));
                output=output+toPiglatin(word)+" ";
            }
        }
        System.out.println(output.trim());
    }
}
