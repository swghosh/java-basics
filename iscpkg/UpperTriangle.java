import java.util.*;
public class UpperTriangle
{
    public static void main(String[] args)
    {
        System.out.println("UPPER TRIANGULAR MATRIX");
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
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(dda[i][j]!=0) flag=false;
            }
        }
        System.out.println((flag)?"Upper Triangular Matrix":"Not Upper Triangular Matrix");
    }
}