public class Factor
{
    public static boolean isPrime(int n)
    {
        int ctr=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            ctr++;
        }
        return (ctr==2)?true:false;
    }
    public static void main(String[] args)
    {
        int n=Integer.parseInt(args[0]);
        int i=n;int j=2;
        while(i>1)
        {
            if(i%j==0 && isPrime(j))
            {
                System.out.print(j+"|"+i+"\n------\n");
                i=i/j;
            }
            else j++;
        }
    }
}