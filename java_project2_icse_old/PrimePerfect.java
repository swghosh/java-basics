import java.util.*;
public class PrimePerfect
{
    public static boolean isPrime(int n)//Checks whether number is Prime or not
    {
        boolean flag=false;int ctr=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0) ctr++;
        }
        if(ctr==2) flag=true;
        return flag;
    }

    public static boolean isPerfect(int n)//Checks whether number is Perfect or not
    {
        boolean flag=false;int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0) sum=sum+i;
        }
        if(sum==n) flag=true;
        return flag;
    }

    public static void main(String[] args)//Main method to be executed
    {
        int[] ar=new int[15];
        System.out.println("---PRIME PERFECT---");
        System.out.print("\nEnter array elements. ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<ar.length;i++)//Takes array elements as input from user
        {
            System.out.print("\nEnter array element no. "+(i+1)+" : ");
            ar[i]=sc.nextInt();
        }
        System.out.println("PRIME NO.(S)");//Prints only prime numbers
        for(int i=0;i<ar.length;i++)
        {
            if(isPrime(ar[i]))
                System.out.println(ar[i]);
        }
        System.out.println("PERFECT NO.(S)");//Prints only perfect numbers
        for(int i=0;i<ar.length;i++)
        {
            if(isPerfect(ar[i]))
                System.out.println(ar[i]);
        }
    }
}