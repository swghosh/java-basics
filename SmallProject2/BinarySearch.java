import java.util.*;
public class BinarySearch
{
    public static void main(String[] args)//Main method to be executed
    {
        System.out.println("---BINARY SEARCH---");
        Scanner sc=new Scanner(System.in);
        Tester ts=new Tester();//Object of class Tester
        int ar[]=ts.readArray();//Reads an array from user
        ar=ts.sortArray(ar);
        System.out.print("\nEnter element to search : ");
        int search=sc.nextInt();
        boolean found=false;int lb=0,ub=ar.length-1,mid=0;
        //Search an element in array
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(search==ar[mid])
            {
                found=true;
                break;
            }
            else if(search>ar[mid])
                lb=mid+1;
            else if(search<ar[mid])
                ub=mid-1;
        }
        System.out.println((found)?"Search Successful. Element found.":"Element not found.");
    }
}
class Tester
{
    public int[] readArray()//Reads an array from user input
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter array size : ");
        int[] ar=new int[sc.nextInt()];
        for(int i=0;i<ar.length;i++)
        {
            System.out.print("\nEnter array element no. "+(i+1)+" : ");
            ar[i]=sc.nextInt();
        }
        return ar;
    }
    public int[] sortArray(int[] ar)//Sorts an array in ascending order
    {
        int i=0,j=0,min=0,pos=0,temp=0;
        for(i=0;i<ar.length;i++)
        {
            min=ar[i];
            pos=i;
            for(j=i+1;j<ar.length;j++)
            {
                if(min>ar[j])
                {
                    min=ar[j];
                    pos=j;
                }
            }
            temp=ar[i];
            ar[i]=ar[pos];
            ar[pos]=temp;
        }
        return ar;
    }
}