import java.util.*;
public class Dda
{
	public static void main(String[] args)
	{
		System.out.println("\t---SQUARE MATRIX---");
		int[][] dda=initDda();
		int len=dda.length;
		System.out.print("_____________________\n\tMatrix\n\t");
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
				System.out.print(dda[i][j]+"\t");
			System.out.print("\n\t");	
		}
		int sum1=0,sum2=0;
		System.out.println("\n\tLeft Diagonal");
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print("\t");
			System.out.print(dda[i][i]+"\n");
			sum1=sum1+dda[i][i];
		}
		System.out.println("\tSum="+sum1);
		System.out.println("\n\tRight Diagonal");
		for(int i=len-1;i>=0;i--)
		{
			for(int j=i;j>=0;j--)
				System.out.print("\t");
			System.out.print(dda[(len-1-i)][i]+"\n");
			sum2=sum2+dda[(len-i-1)][i];
		}
		System.out.println("\tSum="+sum2);
		System.out.println("\nByeee :(");
	}
	public static int[][] initDda()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Rows=Columns ->");
		int n=sc.nextInt();
		int dda[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("Cell Value ("+(i+1)+"x"+(j+1)+") ->");
				dda[i][j]=sc.nextInt();
			}
		}
		return dda;
	}
}