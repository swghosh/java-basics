
/**
 * Write a description of class pattern11 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pattern11
{
    public void main()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print("\t"+i);
            for (int j=i-1;j>=1;j--)
            System.out.print("\t"+j);
            System.out.println();
        }
    }
}
