public class BubbleSort
{
    public static void main(String[] args)//Main method to be executed
    {
        System.out.println("---BUBBLE SORT---");
        Tester ts=new Tester();//Object of class Tester
        int ar[]=ts.readArray();//Reads an array from user
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
}