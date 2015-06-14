import java.util.*;
public class Transarray
{
    int arr[][];int M,N;
    Transarray()
    {
        M=1;N=1;arr=new int[M][N];
    }

    Transarray(int mm,int nn)
    {
        M=mm;N=nn;arr=new int[M][N];
    }

    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<this.M;i++)
        {
            for(int j=0;j<this.N;j++)
            {
                System.out.print("Element ["+(i+1)+"x"+(j+1)+"] [int] ->");
                this.arr[i][j]=sc.nextInt();
            }
        }
    }

    void transpose(Transarray A)
    {
        Transarray B=new Transarray(A.N,A.M);
        for(int i=0;i<A.M;i++)
        {
            for(int j=0;j<A.N;j++)
            {
                B.arr[j][i]=A.arr[i][j];
            }
        }
        this.arr=B.arr;
        this.M=B.M;
        this.N=B.N;
    }

    void disparray()
    {
        for(int i=0;i<this.M;i++)
        {
            System.out.print("|");
            for(int j=0;j<this.N;j++)
            {
                System.out.print(this.arr[i][j]+"|");
            }
            System.out.println();
        }
    }
}
