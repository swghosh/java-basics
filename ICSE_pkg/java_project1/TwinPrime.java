import java.util.*;
public class TwinPrime
{
    public boolean isPrime(int n)
    {
        int ctr=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            ctr++;
        }
        boolean flag=(ctr==2)?true:false;
        return flag;
    }
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("TWIN PRIME CALCULATOR\n\nEnter a no. : ");
        int n1=x.nextInt();
        System.out.print("\nEnter another no. : ");
        int n2=x.nextInt();
        boolean flag=(n1>n2)?(((n1-n2)==2)?true:false):(((n2-n1)==2)?true:false);
        if (flag==true)
        {
            if(isPrime(n1))
            flag=true;
            else
            flag=false;
            if(isPrime(n2))
            flag=true;
            else
            flag=false;
        }
        else
        flag=false;
        String str=(flag==true)?"Twin Prime "+" ("+n1+","+n2+")":"Not Twin Prime"+" ("+n1+","+n2+")";
        System.out.println(str);
    }
}
