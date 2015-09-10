import java.util.*;
public class BubbleSort
{
    public static void main(String[] args)//Main method to be executed
    {
        System.out.println("---BUBBLE SORT---");//Object of class Tester
        int ar[]=readArray();//Reads an array from user
        int i=0,j=0,len=ar.length,temp=0;
        //Sorts the array
        for(i=0;i<len;i++)
        {
            for(j=0;j<len-i-1;j++)
            {
                if(ar[j]<ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array");//Prints sorted array
        for(int f=0;f<ar.length;f++) System.out.print(ar[f]+"|");
        System.out.println();
    }
    public static int[] readArray()//Reads an array from user input
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
}