import java.util.*;
public class Transarray
{
    int arr[][];int M,N;
    /**
     * Transarray Constructor
     *
     */
    Transarray()
    {
        M=1;N=1;arr=new int[M][N];
    }

    /**
     * Transarray Constructor
     *
     * @param mm No of rows
     * @param nn No of colums
     */
    Transarray(int mm,int nn)
    {
        M=mm;N=nn;arr=new int[M][N];
    }

    /**
     * Method fillarray
     * user input array
     */
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

    /**
     * Method transpose
     *
     * @param A Transarray object
     */
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
        this.N=B.N;//transpose of array obtained
    }

    /**
     * Method disparray
     * displays array
     */
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
        }//prints array
    }
}
