import java.util.*;
public class Search
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("DATA FEED");
        System.out.print("\t# of data (accepts word)->");
        int n=sc.nextInt();
        Data d=new Data(n);
        for(int i=0;i<n;i++)
        {
            System.out.print("\tData #"+(i+1)+" (accepts word)->");
            String x=sc.next();
            d.insert(i,x);
        }
        System.out.println("DATA VIEW");
        System.out.print("\t|");
        for(int i=0;i<n;i++)
        {
            System.out.print(d.data[i]+"|");
        }
        System.out.println("\nDATA SEARCH");
        System.out.print("\tData to be searched (accepts word)->");
        String search=sc.next();
        boolean f=d.search(search);
        if(f)
        {
            System.out.println("\tData found.");
        }
        else
        {
            System.out.println("\tData not found.");
        }
    } 
}
