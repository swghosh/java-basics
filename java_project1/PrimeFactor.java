import java.util.*;
public class PrimeFactor
{
    public String primeFactor(int n)
    {
        String str="";
        for(int i=2;i<=n;i++)
        {
            if(n%i==0 && isPrime(i))
            str=str+i+", ";
        }
        str=str+"(no more)";
        return str;
    }
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
        System.out.print("PRIME FACTORS EXTRACTOR\n\nEnter a no. : ");
        int n=x.nextInt();
        System.out.println("Prime Factors : "+primeFactor(n));
    }
}
