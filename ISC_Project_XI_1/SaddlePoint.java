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

    public static int[] indexOfSaddlePoint(int dda[][])
    {
        int ref[]=null;
        for(int i=0;i<dda[0].length;i++)
        {
            int x=indexOfMin(dda[i]);//Checking minimum in current row
            int ar[]=new int[dda[0].length];
            for(int j=0;j<ar.length;j++)
            {
                ar[j]=dda[j][x];
            }
            int y=indexOfMax(ar);//Checking maximum in seleted column
            if(dda[x][y]==dda[i][y])
            {
                ref=new int[2];ref[0]=y;ref[1]=x;
                break;
            }
        }
        return ref;
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
        int ref[]=indexOfSaddlePoint(dda);
        if(ref!=null)
        {
            System.out.println("Saddle Point is Element at ["+(ref[0]+1)+"x"+(ref[1]+1)+"] = "+dda[ref[0]][ref[1]]);
        }
        else
        {
            System.out.println("No Saddle Point");
        }
    }
}
