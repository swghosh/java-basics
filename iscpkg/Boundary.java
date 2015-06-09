import java.util.*;
public class Boundary
{
    public static void main(String[] args)
    {
        System.out.println("BOUNDARY");
        Scanner sc=new Scanner(System.in);
        System.out.print("No. of Rows [int]->");
        int m=sc.nextInt();
        System.out.print("No. of Columns [int]->");
        int n=sc.nextInt();
        int[][] dda=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Element ["+(i+1)+"x"+(j+1)+"] [int]->");
                dda[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            System.out.print("\n|");
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==(m-1) || j==(n-1))
                    System.out.print(dda[i][j]+"|");
                else
                    System.out.print(" "+"|");
            }
        }
    }
}