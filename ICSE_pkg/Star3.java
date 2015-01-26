public class Star3
{
    public static void main(String args[])
    {
        for(int i=1;i<=15;i++)
        {
            System.out.print("               ");
            for(int j=1;j<=(16-i);j++)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
        int k=0;
        for(int i=30;i>=20;i--)
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
        for(int i=20;i<=30;i++)
        {
            System.out.print(" ");
            for(int j=1;j<=k;j++)
            System.out.print(" ");
            k--;
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
        for(int i=15;i>=1;i--)
        {
            System.out.print("               ");
            for(int j=1;j<=(16-i);j++)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
    }
}
