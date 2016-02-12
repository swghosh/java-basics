public class pyra
{
    public static void main(String[] args)
    {
        for(int i=1;i<=30;i++)
        {
            for(int j=30;j>=i;j--)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
    }
}