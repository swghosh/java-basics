import java.util.*;
public class UpperTriangle
{
    /**
     * Method main
     * method is executed at runtime
     * @param args Arguments
     */
    public static void main(String[] args)
    {
        System.out.println("UPPER TRIANGULAR MATRIX");
        Scanner sc=new Scanner(System.in);
        System.out.print("Order of Square Matrix [int]->");//user inputs matrix length
        int n=sc.nextInt();
        int[][] dda=new int[n][n];
        for(int i=0;i<n;i++)//user inputs array elements
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Element ["+(i+1)+"x"+(j+1)+"] [int]->");
                dda[i][j]=sc.nextInt();
            }
        }
        boolean flag=true;
        for(int i=0;i<n;i++)//checks triangular matrix or not
        {
            for(int j=0;j<i;j++)
            {
                if(dda[i][j]!=0) flag=false;
            }
        }
        System.out.println((flag)?"Upper Triangular Matrix":"Not Upper Triangular Matrix");//prints whether triangular matrix or not
    }
}