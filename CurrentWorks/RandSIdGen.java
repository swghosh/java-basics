import java.io.*;
import java.util.*;
public class RandSIdGen
{
    public static int[] randSIdGen(int limit)
    {
        int olimit=limit*100;
        int[] ar=new int[limit];
        int i=0;
        while(i<limit)
        {
            int ranhash=(int)(Math.random()*olimit);
            if(doesNotContain(ranhash,ar))
            {
                ar[i++]=ranhash;
            }
        }
        return ar;
    }
    public static String[] randSIdGen(int[] ar)
    {
        String str[]=new String[ar.length];
        int hlim=ar.length*100;
        int elimit=noOfDigits(hlim);
        for(int i=0;i<str.length;i++)
        {
            str[i]="S";
            for(int j=1;j<=(elimit-noOfDigits(ar[i]));j++)
            {
                str[i]=str[i]+"0";
            }
            str[i]=str[i]+Integer.toString(ar[i]);
        }
        return str;
    }
    private static boolean doesNotContain(int n,int[] ar)
    {
        boolean flag=true;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==n)
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static int noOfDigits(int n)
    {
        return Integer.toString(n).length();
    }
    public static void main(String args[])
    {
        int limit=Integer.parseInt(args[0]);
        String[] str=randSIdGen(randSIdGen(limit));
        for(int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }
    }
    public static void main(PrintWriter out,int limit)
    {
        String[] str=randSIdGen(randSIdGen(limit));
        for(int i=0;i<str.length;i++)
        {
            out.println(str[i]);
        }
    }
}
