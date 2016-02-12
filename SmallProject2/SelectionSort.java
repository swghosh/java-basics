import java.util.*;
public class SelectionSort
{
    public static void main(String[] args)
    {
        System.out.println("---SELECTION SORT---");
        char[] ch=new ArrayTest().readArray();//Reads a character array from user
        int i=0,j=0,pos=0;char min=' ',temp=' ';
        for(i=0;i<ch.length;i++)//Sorts the array
        {
            min=ch[i];
            pos=i;
            for(j=i+1;j<ch.length;j++)
            {
                if((int)min>(int)ch[j])
                {
                    min=ch[j];
                    pos=j;
                }
            }
            temp=ch[i];
            ch[i]=ch[pos];
            ch[pos]=temp;
        }
        System.out.println("Sorted Array");//Prints sorted array
        for(int f=0;f<ch.length;f++) System.out.print(ch[f]+"|");
        System.out.println();
    }
}       
class ArrayTest
{
    public char[] readArray()//Reads a character array from user
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter array size : ");
        char[] ar=new char[sc.nextInt()];
        for(int i=0;i<ar.length;i++)
        {
            System.out.print("\nEnter array element no. "+(i+1)+" : ");
            ar[i]=sc.next().charAt(0);
        }
        return ar;
    }
}