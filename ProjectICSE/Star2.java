public class Star2
{
    public static void main(String args[])
    {
        for(int i=1;i<=3;i++)
        {
            System.out.print("   ");
            for(int j=1;j<=(4-i);j++)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
        int k=0;
        for(int i=6;i>=4;i--)
        {
            System.out.print(" ");
            for(int j=1;j<=k;j++)
            System.out.print(" ");
            k++;
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
        k--;
        for(int i=4;i<=6;i++)
        {
            System.out.print(" ");
            for(int j=1;j<=k;j++)
            System.out.print(" ");
            k--;
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
        for(int i=3;i>=1;i--)
        {
            System.out.print("   ");
            for(int j=1;j<=(4-i);j++)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
    }
}
