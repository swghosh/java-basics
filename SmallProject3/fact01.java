
/**
 * Write a description of class fact01 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fact01
{
    public int factorial(int n)
    {
        int fact=1;
        for (int i=1;i<=n;i++)
        fact=fact*i;
        return fact;
    }
    public void main()
    {
        int S=0;
        for (int i=1;i<=10;i++)
        S=S+factorial(i);
        System.out.println("Sum of Series="+S);
    }
}
