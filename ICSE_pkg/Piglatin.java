import java.util.*;
public class Piglatin
{
    Repeater r=new Repeater();
    public String toPiglatin(String str)
    {
        str=str.toUpperCase();
        String output="";
        char ch=' ';
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='U')
            {
                output=str.substring(i)+str.substring(0,i)+"AY";
                break;
            }
        }
        return output;
    }
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("\nEnter a string/sentence : ");
        String str=x.nextLine();String word="";String output="";
        for(int i=1;i<=r.countWords(str);i++)
        {
            word=r.wordAtPos(i,str);
            output=output+toPiglatin(word)+" ";
        }
        System.out.println("In Piglatin form : "+output);
    }
}
