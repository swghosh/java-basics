
/**
 * Write a description of class pattern14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pattern14
{
    public void main()
    {
        for(int i=5;i>=1;i--)
        {
            for (int j=5;j>=i;j--)
            System.out.print("\t"+j);
            System.out.println();
        }
    }
}
