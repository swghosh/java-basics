import java.util.*;
public class Collection
{
    int ar[];int len;
    Collection()
    {
        ar=new int[1];len=1;
    }
    Collection(int l)
    {
        ar=new int[l];len=l;
    }
    void inputArr()
    {
        System.out.println("Input Array");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<len;i++)
        {
            System.out.print("Cell <"+(i+1)+"> [number] ");
            ar[i]=sc.nextInt();
        }
    }
    Collection common(Collection c)
    {
        int ans[];int limit=0;
        for(int i=0;i<this.len;i++)
        {
            for(int j=0;j<c.len;j++)
                if(this.ar[i]==c.ar[j])
                    limit++;
        }
        ans=new int[limit];
        int k=0;
        for(int i=0;i<this.len;i++)
        {
            for(int j=0;j<c.len;j++)
                if(this.ar[i]==c.ar[j])
                    ans[k++]=this.ar[i];
        }
        Collection a=new Collection(limit);
        a.ar=ans;
        return a;
    }
    //Main method to be executed
    public static void main(String args[])
    {
        Collection c1=new Collection(3);
        Collection c2=new Collection(4);
        c1.inputArr();
        System.out.println();
        c2.inputArr();
        Collection c3=c1.common(c2);
        for(int y:c3.ar)
        System.out.println(y);
    }
}