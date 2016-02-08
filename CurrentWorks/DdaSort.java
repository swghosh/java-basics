//SwG Ghosh
import java.util.*;
public class DdaSort
{
    static int[][] ddaSort(int[][] ar) throws ArrayIndexOutOfBoundsException
    {
        int m=ar.length;
        int n=ar[0].length;
        int limit=m*n;
        for(int i=0;i<limit-1;i++)
        {
            for(int j=i+1;j<limit;j++)
            {
                int temp=0;
                if(ar[i/n][i%n]>ar[j/n][j%n])
                {
                    temp=ar[i/n][i%n];
                    ar[i/n][i%n]=ar[j/n][j%n];
                    ar[j/n][j%n]=temp;
                }
            }
        }
        return ar;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Row Length->");
        int m=sc.nextInt();
        System.out.print("Column Length->");
        int n=sc.nextInt();
        int ar[][]=new int[m][n];//user input
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Element ["+(i+1)+"]["+(j+1)+"] ->");
                ar[i][j]=sc.nextInt();
            }
        }
        ar=ddaSort(ar);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
