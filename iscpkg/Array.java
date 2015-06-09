import java.util.*;
public class Array
{
    int ar[];
    int n;
    int num;
    Array()
    {
        ar=new int[100];
        n=0;
    }

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

    int process(Array B,int k)
    {
        num=k;int ctr=0;
        for(int i=0;i<B.n;i++)
        {
            if(B.ar[i]==this.num) ctr++;
        }
        return ctr;
    }

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
        return b;
    }

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
        c=a.merge(b);
        System.out.println("---------\nMERGED ARRAY");
        c.display();
    }
}
