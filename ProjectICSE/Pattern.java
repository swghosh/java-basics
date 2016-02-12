
/**
 * Write a description of class Pattern here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pattern
{
    public static void main(String[] args)
    {
        for(int i=5,j=1;i>0;i--,j++)
        {
            for(int c=1;c<i;c++)
                for(int y=1;y<=c;y++)
                    System.out.print("\t");
            for(int d=1;d<=j;d++)
                System.out.print("*"+"\t");
            System.out.print("\n");
        }
    }
}
