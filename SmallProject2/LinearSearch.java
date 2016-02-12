import java.util.*;
public class LinearSearch
{
    static int ar[];//Static instance variable, integer array
    public static void main(String[] args)//Main method to be executed
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("---LINEAR SEARCH---");
        System.out.print("\nEnter array size : ");
        ar=new int[sc.nextInt()];
        for(int i=0;i<ar.length;i++)//Takes array elements as user input
        {
            System.out.print("\nEnter element no. "+(i+1)+" : ");
            ar[i]=sc.nextInt();
        }
        System.out.print("\nEnter array element to search : ");
        int search=sc.nextInt();
        boolean flag=false;int pos=0;
        for(int i=0;i<ar.length;i++)//Search the element in the array
        {
            if(ar[i]==search)
            {
                flag=true;
                pos=i+1;
                break;
            }
        }
        System.out.println((flag)?("Search Successful. Element found at "+pos+"."):("Element not found."));
    }
}
