import java.util.*;
public class Krishnamoorty
{
    public long factorial(int n)
    {
        long f=1;
        for(int i=1;i<=n;i++)
        f=f*i;
        return f;
    }
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("\nEnter a No.: ");
        int n=x.nextInt();
        int i=n;long s=0;
        while(i>0)
        {
            s=s+factorial(i%10);
            i=i/10;
        }
        if (s==n)
        System.out.print("\nKrishnamoorty No.");
        else
        System.out.print("\nNot a Krishnamoorty No.");
    }
}
