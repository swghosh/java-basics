//Program to print a number in words between 0-999 (terminal-console-application-x/java-executable)
import java.util.*;
public class Word
{
    public static int[] digits(int n)
    {
        int ar[]=new int[countDigits(n)];
        int i=0;
        while(n>0)
        {
            ar[i++]=n%10;
            n=n/10;
        }
        return ar;
    }

    public static int countDigits(int n)
    {
        int ctr=0;
        while(n>0)
        {
            ctr++;
            n=n/10;
        }
        return ctr;
    }

    public static String toWord(int n)
    {
        String output="";
        if(n>999 || n<0)
            return "";
        String[] o={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String[] t={"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String[] sp={"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String[] h=new String[11];
        for(int i=1;i<10;i++)
        {
            h[i]=o[i]+" Hundred";
        }
        if(n==0)
            output=o[0];
        else if(n>0 && n<10)
        {
            for(int i=1;i<10;i++)
                if(i==n) output=output+o[i];
        }
        else if(n>=10 && n<100)
        {
            int digit[]=digits(n);
            for(int i=1;i<=9;i++)
            {
                if(digit[0]==i)
                    output=output+o[i];
            }
            if(digit[1]==1)
            {
                for(int i=1;i<=9;i++)
                    if(digit[1]==i)
                        output=sp[i];
            }
            else
            {
                for(int i=1;i<=9;i++)
                    if(digit[1]==i)
                        output=t[i]+" "+output;
            }
        }
        else if(n>=100 && n<1000)
        {
            int digit[]=digits(n);
            for(int i=1;i<=9;i++)
            {
                if(digit[0]==i)
                    output=output+o[i];
            }
            if(digit[1]==1)
            {
                for(int i=1;i<=9;i++)
                    if(digit[1]==i)
                        output=" and "+sp[i];
            }
            else
            {
                for(int i=1;i<=9;i++)
                    if(digit[1]==i)
                        output=" and "+t[i]+" "+output;
            }
            for(int i=1;i<=9;i++)
            {
                if(digit[2]==i)
                    output=h[i]+output;
            }
        }
        return output.trim();
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("-----NUMBER -> WORD-----");
        System.out.print("Enter a no. (range:0-999) : ");
        int n=sc.nextInt();
        System.out.println(toWord(n));
    }
}