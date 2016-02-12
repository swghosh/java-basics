public class Pyramid
{
    public static void main(String[] args)
    {
        for(int i=1;i<=25;i++)
        {
            for(int j=1;j<=(25-i);j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("\nKeepCalm; && KeepCoding()\nCopyright (C) SwG Ghosh!");
    }
}
