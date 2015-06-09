import java.util.*;
public class SaddlePoint
{
    public static int indexOfMin(int[] ar)
    {
        int min=ar[0];int k=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<min){ min=ar[i];k=i;}
        }
        return k;
    }

    public static int indexOfMax(int[] ar)
    {
        int max=0;int k=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max){ max=ar[i];k=i;}
        }
        return k;
    }

    public static void main(String[] args)
    {
        System.out.println("SADDLE POINT");
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
        int min[]=new int[n];
        for(int i=0;i<n;i++)
        {
            min[i]=dda[i][indexOfMin(dda[i])];
        }
        int sp=min[indexOfMax(min)];
        System.out.println("Saddle point="+sp);
    }
}
