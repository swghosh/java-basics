
/**
 * Write a description of class patternh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class patternh
{
    public void main()
    {
        int i,j,k=0;
        for(i=5;i>0;i--)
        {
            System.out.print((char)(k+97));
            for(j=0;j<=(i-2);j++)
            {
                k=k+i;
                System.out.print("\t"+(char)(k+97));
            }
            k=0;
            System.out.println();
        }
    }
}
