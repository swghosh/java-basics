import java.util.*;
public class Array
{
    int ar[];
    int n;
    int num;
    /**
     * Array Constructor
     *
     */
    Array()
    {
        ar=new int[100];
        n=0;
    }

    /**
     * Method getArray
     * takes array from user
     */
    void getArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Array Length->");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Element ["+(i+1)+"] [int]->");
            ar[i]=sc.nextInt();
        }
    }

    /**
     * Method process
     *
     * @param B A parameter
     * @param k A parameter
     * @return The return value
     */
    int process(Array B,int k)
    {
        num=k;int ctr=0;
        for(int i=0;i<B.n;i++)
        {
            if(B.ar[i]==this.num) ctr++;
        }
        return ctr;
    }

    /**
     * Method merge
     * merges 2 array objects
     * @param a Array object
     * @return Merged Array
     */
    Array merge(Array a)
    {
        Array b=new Array();
        b.n=this.n+a.n;int k=0;
        for(int i=0;i<this.n;i++)
        {
            b.ar[k++]=this.ar[i];
        }
        for(int i=0;i<a.n;i++)
        {
            b.ar[k++]=a.ar[i];
        }
        return b;//merged array
    }

    /**
     * Method display
     * displays array elements
     */
    void display()
    {
        for(int i=0;i<n;i++)
        {
            if(i%4!=0)
            {
                System.out.print(ar[i]+"\t");
            }
            else
                System.out.print("\n"+ar[i]+"\t");
        }
    }

    /**
     * Method main
     * method executed at runtime
     * @param args Arguments
     */
    public static void main(String args[])
    {
        Array a=new Array();
        Array b=new Array();
        System.out.println("ARRAY 1");
        a.getArray();
        System.out.print("Check Frequency of [int]->");
        int k=new Scanner(System.in).nextInt();
        System.out.println("Frequency of "+k+"="+a.process(a,k));
        System.out.println("---------\nARRAY 2");
        b.getArray();
        Array c=new Array();
        c=a.merge(b);//merges 2 user input array
        System.out.println("---------\nMERGED ARRAY");
        c.display();//prints merged array
    }
}
