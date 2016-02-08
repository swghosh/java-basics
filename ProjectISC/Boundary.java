import java.util.*;
public class Boundary
{
    /**
     * Method main
     * method is executed at runtime
     * @param args Arguments
     */
    public static void main(String[] args)
    {
        System.out.println("BOUNDARY");
        Scanner sc=new Scanner(System.in);
        System.out.print("No. of Rows [int]->");
        int m=sc.nextInt();//user inputs no of rows
        System.out.print("No. of Columns [int]->");
        int n=sc.nextInt();//user inputs no of columns
        int[][] dda=new int[m][n];
        for(int i=0;i<m;i++)//user inputs array elements
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Element ["+(i+1)+"x"+(j+1)+"] [int]->");
                dda[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)//prints only boundary of array
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