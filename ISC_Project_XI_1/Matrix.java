import java.util.*;
public class Matrix
{
    int ar[][];int m,n;
    Matrix(int mm,int nn)
    {
        m=mm;n=nn;
        ar=new int[m][n];
    }

    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Element ["+(i+1)+"X"+(j+1)+"] [int] ->");
                ar[i][j]=sc.nextInt();
            }
        }
    }

    Matrix subMat(Matrix A)
    {
        Matrix b=new Matrix(A.m,A.n);
        if(this.m==A.m && this.n==A.n)
        {
            for(int i=0;i<A.m;i++)
            {
                for(int j=0;j<A.n;j++)
                {
                    b.ar[i][j]=this.ar[i][j]-A.ar[i][j];
                }
            }
        }
        return b;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("MATRIX SUBTRACTION");
        System.out.print("Rows [int] ->");
        int mm=sc.nextInt();
        System.out.print("Cols [int] ->");
        int nn=sc.nextInt();
        Matrix a=new Matrix(mm,nn);
        Matrix b=new Matrix(mm,nn);
        Matrix c=new Matrix(mm,nn);
        System.out.println("-----\nMATRIX 1");
        a.fillarray();
        System.out.println("-----\nMATRIX 2");
        b.fillarray();
        System.out.println("-----\nSUBTRACTION MATRIX");
        c=a.subMat(b);
        for(int i=0;i<c.ar.length;i++)
        {
            for(int j=0;j<c.ar[0].length;j++)
            {
                System.out.print(c.ar[i][j]+"|");
            }
            System.out.println();
        }
    }
}