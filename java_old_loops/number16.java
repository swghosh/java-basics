
/**
 * Write a description of class number16 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class number16
{
    public int countDigit(int n)
    {
        int ctr=0;
        for (int i=n;i>0;i=i/10)
        {
            ctr=ctr+1;
        }
        return ctr;
    }
    public boolean isPalindrome(int n)
    {
        boolean flag=false;
        double rev=0;int d=(countDigit(n))-1;double par;
        for (int i=n;i>0;i=i/10)
        {
            par=(i%10)*Math.pow(10,d);
            d--;
            rev=rev+par;
        }
        if (rev==n)
        flag=true;
        return flag;
    }
    public boolean isPerfect(int n)
    {
        boolean flag=false;int r=0;
        for(int i=1;i<n;i++)
        {
            if (n%i==0)
            r=r+i;
        }
        if (n==r)
        flag=true;
        return flag;
    }
    public void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("----MENU----");
        System.out.println("1 - To check palindrome number");
        System.out.println("2 - To check perfect number");
        System.out.print("\nEnter your choice: ");
        int ch=s.nextInt();
        System.out.print("\nEnter a number: ");
        int n=s.nextInt();
        switch (ch)
        {
            case 1:
            if (isPalindrome(n))
            System.out.println("Palindrome no.");
            else
            System.out.println("Not Palindrome no.");
            break;
            case 2:
            if (isPerfect(n))
            System.out.println("Perfect no.");
            else
            System.out.println("Not Perfect no.");
            break;
            default:
            System.out.print("\nInvalid Choice");
        }
    }
}
