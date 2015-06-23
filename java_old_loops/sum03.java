
/**
 * Write a description of class sum03 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sum03
{
    public void main()
    {
        int S=0;int l=0;
        for (int i=1;i<20;i++)
        {
            l=i+1;
            S=S+(i*l);
        }
        System.out.println("Sum of Series="+S);
    }
}
