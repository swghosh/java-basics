import java.util.*;
public class numberx
{
    public boolean isPalindrome(int n)
    {
        boolean flag=false;
        int rev=0;
        for(int i=n;i>0;i=i/10)
        rev=rev+(i%10);
        if (n==rev)
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
        System.out.print("\nEnter a no.");
        int n=s.nextInt();
        if (isPalindrome(n))
        System.out.print("\nPalindrome Number");
        if (isPerfect(n))
        System.out.print("\nPerfect Number");       
    }
}
