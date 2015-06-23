import java.util.*;
public class Consecutive
{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("CONSECUTIVE");
        System.out.print("Word [string] ->");
        String str=sc.next();
        String output="";
        for(int i=0;i<str.length();i++)
        {
            if(str.substring(i+1).indexOf(str.charAt(i))==0)
                continue;
            else output=output+str.charAt(i);
        }
        System.out.println("Correction = "+output);
    }
}
