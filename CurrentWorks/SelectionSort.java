import java.util.*;
public class SelectionSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("DATA FEED");
        System.out.print("\t# of data (accepts integer)->");
        int n=sc.nextInt();
        int[] d=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("\tData #"+(i+1)+" (accepts integer)->");
            d[i]=sc.nextInt();
        }
        
        int temp=0,min=0;
        for(int i=0;i<n-1;i++)
        {
            min=i;
            for(int j=i+1;j<n;j++)
            {
                if(d[j]<d[min])
                {
                    min=j;
                }
                temp=d[i];
                d[i]=d[min];
                d[min]=temp;
            }
        }
        
        System.out.println("DATA VIEW");
        System.out.print("\t|");
        for(int i=0;i<n;i++)
        {
            System.out.print(d[i]+"|");
        }
    }
}
