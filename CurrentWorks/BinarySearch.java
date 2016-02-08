import java.util.*;
public class BinarySearch
{
    static int[] d=new int[10];
    public static void main(String args[])
    {
        for(int i=0;i<10;i++)
        {
            d[i]=i;;
        }
        System.out.println(binarySearch(67));
    }
    static boolean binarySearch(int item)
    {
        boolean flag=false;
        int first=0;
        int last=d.length-1;
        int mid=(first+last)/2;
        while(first<=last)
        {
            mid=(first+last)/2;
            if(d[mid]<item)
            {
                first=mid+1;
            }
            else if(d[mid]>item)
            {
                last=mid-1;
            }
            else if(d[mid]==item)
            {
                flag=true;
                break;
            }
        }
        return flag;
    }
}
