import java.util.*;
public class Double
{
    public static void main(String[] args)//Main method to be executed
    {
        int[] ar=new int[15];
        System.out.println("---DOUBLE---");
        System.out.print("\nEnter array elements. ");
        Scanner sc=new Scanner(System.in);//Takes array elements as user input
        for(int i=0;i<ar.length;i++)
        {
            System.out.print("\nEnter array element no. "+(i+1)+" : ");
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++)//Doubles the elements in the array
            ar[i]=2*ar[i];
        System.out.println("\nDOUBLED ELEMENTS");
        for(int i=0;i<ar.length;i++)//Prints the final elements of the array
            System.out.print(ar[i]+"|");
        System.out.println();
    }
}