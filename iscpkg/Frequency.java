import java.util.*;
public class Frequency
{
    public static void main(String args[])
    {
        System.out.println("FREQUENCY");
        System.out.print("Word [string] ->");
        String str=new Scanner(System.in).next().toLowerCase();
        int ctr[]=new int[26];
        for(int i=0;i<str.length();i++)
        {
            int k=(int)(str.charAt(i))-97;
            ctr[k]++;
        }
        System.out.println("ALPHABET\tFREQUENCY\n--------------------------");
        for(int i=0;i<ctr.length;i++)
        {
            if(ctr[i]!=0) System.out.println((char)(97+i)+"\t\t"+ctr[i]);
        }
    }
}