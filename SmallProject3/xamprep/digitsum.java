package xamprep;
/**
 * Write a description of class digitsum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class digitsum
{
    public int digitSum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }
    public void main()
    {
        for(int i=1;i<=100;i++)
        {
            if((digitSum(i))%10==5)
            System.out.println(i);
        }
    }
}
