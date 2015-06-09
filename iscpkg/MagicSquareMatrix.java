import java.util.*;
public class MagicSquareMatrix
{
    public static void main(String[] args)
    {
        System.out.println("MAGIC SQUARE MATRIX");
        Scanner sc=new Scanner(System.in);
        System.out.print("Order of Square Matrix [int]->");
        int n=sc.nextInt();
        int[][] dda=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Element ["+(i+1)+"x"+(j+1)+"] [int]->");
                dda[i][j]=sc.nextInt();
            }
        }
        
    }
}
