package xamprep;
/**
 * Write a description of class Armstrong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Armstrong
{
    public int countDigit(int n)
    {
        int ctr=0;
        for(;n>0;n/=10)
        ctr=ctr+1;
        return ctr;
    }
    public boolean isArmstrong(int n)
    {
        boolean flag=false;
        double f=countDigit(n);int rem=0;double sum=0;
        for(int i=n;i>0;i/=10)
        {
            rem=i%10;
            sum=sum+Math.pow(rem,f);
        }
        if(sum==n)
        flag=true;
        return flag;
    }
    public void seriesArmstrong()
    {
        for(int i=50;i<=250;i++)
        {
            if (isArmstrong(i))
            System.out.println(i);
        }
    }
}
