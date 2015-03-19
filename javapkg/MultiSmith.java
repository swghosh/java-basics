
/**
 * Write a description of class MultiSmith here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MultiSmith
{
    public static boolean isSmithNo(int n)
    {
        int i=n;//Backup
        int sum=0;int j=2;//Loop counter to check whether a factor or not
        while(i>1)
        {
            if(i%j==0 && SmithNo.isPrime(j))
            {
                sum=sum+SmithNo.sumOfDigits(j);
                i=i/j;
            }
            else j++;
        }
        return (sum==SmithNo.sumOfDigits(n))?true:false;
    }
    public static void main(String[] args)
    {
        for(int i=1;i<=1000;i++)
        System.out.println("\t\t"+i+"|"+((isSmithNo(i))?"Smith Detected :)\nHurrah!\n\n":"Smith not detected! :("));
    }
}
