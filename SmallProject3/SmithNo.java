
/**
 * Write a description of class SmithNo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class SmithNo
{
    public static boolean isPrime(int n)
    {
        int ctr=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)
                ctr++;
        return (ctr==2)?true:false;
    }

    public static int sumOfDigits(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\n\t\t-----SMITH NUMBER DETECTOR-----\n\tNumber -> ");
        int n=sc.nextInt();
        int i=n;//Backup
        int sum=0;int j=2;//Loop counter to check whether a factor or not
        while(i>1)
        {
            if(i%j==0 && isPrime(j))
            {
                sum=sum+sumOfDigits(j);
                i=i/j;
            }
            else j++;
        }
        System.out.print((sum==sumOfDigits(n))?"\n\tTest Successful;\n\t\tSmith number detected :)\n":"\n\tTest Successful;\n\t\tSmith number not detected :(\n");
    }
}
