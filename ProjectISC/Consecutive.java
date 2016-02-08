import java.util.*;
public class Consecutive
{
    /**
     * Method main
     * method is executed at runtime
     * @param args Arguments
     */
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("CONSECUTIVE");
        System.out.print("Word [string] ->");
        String str=sc.next();//user input string
        String output="";
        for(int i=0;i<str.length();i++)//removes consecutive occurences of a character
        {
            if(str.substring(i+1).indexOf(str.charAt(i))==0)
                continue;
            else output=output+str.charAt(i);
        }
        System.out.println("Correction = "+output);//prints final string
    }
}
