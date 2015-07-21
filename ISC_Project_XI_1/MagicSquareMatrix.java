import java.util.*;
public class MagicSquareMatrix
{
    /**
     * Method main
     * method is executed at runtime
     * @param args Arguments
     */
    public static void main(String[] args)
    {
        System.out.println("MAGIC SQUARE MATRIX");
        Scanner sc=new Scanner(System.in);
        System.out.print("Order of Square Matrix [int]->");
        int n=sc.nextInt();
        int[][] dda=new int[n][n];
        for(int i=0;i<n;i++)//user inputs matrix elements
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Element ["+(i+1)+"x"+(j+1)+"] [int]->");
                dda[i][j]=sc.nextInt();
            }
        }
        boolean flag=true;//stores whether matrix is magic square or not
        int sum1=0;
        for(int i=0;i<n;i++)
        {
            sum1=sum1+dda[0][i];
        }
        for(int i=0;i<n && flag;i++)//performs magic square test
        {
            int sum2=0;
            for(int j=0;j<n;j++)
            {
                sum2=sum2+dda[i][j];
            }
            if(sum2!=sum1)
            {
                flag=false;
                break;
            }
        }
        int s=0;
        for(int i=0;i<n;i++)//prints left diagonal
        {
            s=s+dda[i][i];
        }
        if(s!=sum1) flag=false;
        System.out.print(((flag)?"Magic Square Matrix.":"Not Magic Square Matrix."));//prints whether magic square matrix or not
    }
}
