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
        boolean flag=true;
        int sum1=0;
        for(int i=0;i<n;i++)
        {
            sum1=sum1+dda[0][i];
        }
        for(int i=0;i<n && flag;i++)
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
        for(int i=0;i<n;i++)
        {
            s=s+dda[i][i];
        }
        if(s!=sum1) flag=false;
        System.out.print(((flag)?"Magic Square Matrix.":"Not Magic Square Matrix."));
    }
}
