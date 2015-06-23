
/**
 * Write a description of class pattern13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pattern13
{
    public void main()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            System.out.print("\t"+j);
            System.out.println();
        }
    }
}
