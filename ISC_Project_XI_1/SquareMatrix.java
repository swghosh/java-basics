import java.util.*;
public class SquareMatrix
{    
    public static void main(String args[])
    {
        System.out.println("SQUARE MATRIX");
        Scanner sc=new Scanner(System.in);
        System.out.print("Order of Square Matrix [int]->");
        int M=sc.nextInt();
        if(M<2||M>10)
        {
            System.out.println("MATRIX SIZE OUT OF RANGE");
            return;
        }
        int[][] dda=new int[M][M];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print("Element ["+(i+1)+"x"+(j+1)+"] [int]->");
                dda[i][j]=sc.nextInt();
            }
        }
        boolean flag=true;
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(dda[i][j]!=dda[j][i]) 
                {
                    flag=false;break;
                }
            }
        }
        System.out.print("\nORIGINAL MATRIX");
        for(int i=0;i<M;i++)
        {
            System.out.print("\n|");
            for(int j=0;j<M;j++)
            {
                System.out.print(dda[i][j]+"|");
            }
        }
        System.out.println();
        System.out.println(((flag)?"SYMMETRIC":"NOT SYMMETRIC"));
        System.out.println();
		int sum1=0,sum2=0;
		System.out.println("\nLEFT DIAGONAL");
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print("\t");
			System.out.print(dda[i][i]+"\n");
			sum1=sum1+dda[i][i];
		}
		System.out.println("\tSum="+sum1);
		System.out.println("\nRIGHT DIAGONAL");
		for(int i=M-1;i>=0;i--)
		{
			for(int j=i;j>=0;j--)
				System.out.print("\t");
			System.out.print(dda[(M-1-i)][i]+"\n");
			sum2=sum2+dda[(M-i-1)][i];
		}
		System.out.println("\tSum="+sum2);
    }
}