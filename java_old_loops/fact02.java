
/**
 * Write a description of class fact02 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fact02
{
    public double factorial(double n)
    {
        double fact=1;
        for (double i=1;i<=n;i++)
        fact=fact*i;
        return fact;
    }
    public void main()
    {
        double S=1;double l=1;
        for (double i=2;i<=10;i++)
        {
            l=1/factorial(i);
            S=S+l;
        }
        System.out.println("Sum of Series="+S);
    }
}
