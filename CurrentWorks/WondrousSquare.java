import java.util.Scanner;
public class WondrousSquare
{
    static boolean isWondrousSquare(int[][] matrix)
    {
        int n=matrix.length;
        int limx=(int)(0.5*n*((n*n)+1));
        int omat[]=new int[n*n];
        boolean flag=true;
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int x=matrix[i][j];
                boolean f=((1<=x) && (x<=(n*n)) && !contains(omat,x,k-1));
                if(!f) return flag=false;
                omat[k++]=x;
            }
            if(rowAdder(matrix,i)==limx && columnAdder(matrix,i)==limx) continue;
            else return flag=false;
        }
        return flag;
    }

    static int rowAdder(int[][] dda,int rin)
    {
        int sum=0;
        for(int i=0;i<dda[0].length;i++)
        {
            sum=sum+dda[rin][i];
        }
        return sum;
    }

    static int columnAdder(int[][] dda,int cin)
    {
        int sum=0;
        for(int i=0;i<dda.length;i++)
        {
            sum=sum+dda[i][cin];
        }
        return sum;
    }

    static boolean contains(int[] ar,int n,int index)
    {
        for(int i=0;i<=index;i++) if(ar[i]==n) return true;
        return false;
    }

    static boolean isPrime(int n)
    {
        int ctr=0;
        for(int i=1;i<=n;i++) if(n%i==0) ctr++;
        return ctr==2;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Wondrous Matrix Tester");
        System.out.print("Order of Matrix ->");
        int n=sc.nextInt();
        if(n<=2 || n>=10)
        {
            System.err.println("Invalid Order");
            return;
        }
        int[][] ar=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Element @ ["+i+"x"+j+"] ->");
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println(((isWondrousSquare(ar))?"Wondrous Square":"Not Wondrous Square"));
        System.out.println("PRIME\tROW INDEX\tCOLUMN INDEX");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isPrime(ar[i][j]))
                    System.out.println(ar[i][j]+"\t"+i+"\t"+j);
            }
        }
    }
}
