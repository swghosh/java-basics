package xamprep;


/**
 * Write a description of class worksheet1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class worksheet1
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("\nEnter a string of letters seperated by spaces: ");
        String s=x.nextLine(),ms="";char ch=' ',ch2=' ';int ctr=1;
        for(int i=0,v=0,c=0;i<s.length();i++,v=0,c=0)
        {
            ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                ch2=(char)((int)(ch)+ctr);
                if (Character.isLetter(ch2)==false)
                {
                    if(Character.isUpperCase(ch))
                    {
                        v=90-(int)(ch);
                        c=ctr-v;ms=ms+(char)((int)(65+c));
                    }
                    else if(Character.isLowerCase(ch))
                    {
                        v=122-(int)(ch);
                        c=ctr-v;ms=ms+(char)((int)(97+c));
                    }
                }
                else
                ms=ms+ch2;
            }
            else
            ms=ms+ch;
            ctr++;
        }
        System.out.print(ms);
    }
}
