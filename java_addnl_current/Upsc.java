public class Upsc
{
	public static int[] amt()
	{
		for(int i=1;i<=15;i+=2)
		{
			for(int j=1;j<=15;j+=2)
			{
				for(int k=1;k<=15;k+=2)
				{
					if(i+j+k==30)
					{
						int ar[]={i,j,k};
						return ar;
					}
				}
			}
		}
		return new int[1];
	}
	public static void main(String args[])
	{
		for(int n:amt())
		{
			System.out.println(n);
		}
	}
}