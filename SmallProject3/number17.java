import java.util.*;
public class number17
{
    public boolean isPrime(int n)
    {
        int ctr=0;boolean flag=false;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            ctr=ctr+1;
        }
        if (ctr==2)
        flag=true;
        return flag;
    }
    public boolean isAutomorphic(int n)
    {
        int ctr=0;double sq=Math.pow(n,2);boolean flag=false;
        for (int i=n;i>0;i=i/10)
        ctr=ctr+1;
        double par=Math.pow(10,ctr);
        double y=sq%par;
        if(y==n)
        flag=true;
        return flag;
    }
    public void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("----MENU----");
        System.out.println("1 - To check Prime number");
        System.out.println("2 - To check Automorphic number");
        System.out.print("\nEnter your choice: ");
        int ch=s.nextInt();
        System.out.print("\nEnter a number: ");
        int n=s.nextInt();
        switch (ch)
        {
            case 1:
            if (isPrime(n))
            System.out.println("Prime no.");
            else
            System.out.println("Not Prime no.");
            break;
            case 2:
            if (isAutomorphic(n))
            System.out.println("Automorphic no.");
            else
            System.out.println("Not Automorphic no.");
            break;
            default:
            System.out.print("\nInvalid Choice");
        }
    }
}
