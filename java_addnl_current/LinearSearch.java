import java.util.Scanner;
public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("DATA FEED");
        int ardata[];
        System.out.print("\t# of data (accepts integer value)->");
        int n=sc.nextInt();
        ardata=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("\tData #"+(i+1)+" (accepts integer value)->");
            ardata[i]=sc.nextInt();
        }
        System.out.println("DATA VIEW");
        System.out.print("\t|");
        for(int i=0;i<n;i++)
        {
            System.out.print(ardata[i]+"|");
        }
        System.out.println("\nDATA SEARCH");
        System.out.print("\tData to be searched (accepts integer value)->");
        int search=sc.nextInt();
        int pos=-1;
        for(int i=0;i<n;i++)
        {
            if(ardata[i]==search)
            {
                pos=i;break;
            }
        }
        if(pos!=-1)
        {
            System.out.println("\tData found at "+(pos+1)+".");
        }
        else
        {
            System.out.println("\tData not found.");
        }
    }
}