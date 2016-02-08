import java.util.*;
public class Collection
{
    int ar[];int len;
    /**
     * Collection Constructor
     *
     */
    Collection()
    {
        ar=new int[100];len=1;
    }

    /**
     * Collection Constructor
     *
     * @param l Length of array
     */
    Collection(int l)
    {
        ar=new int[100];len=l;
    }

    /**
     * Method input
     * user input of array
     */
    void input()
    {
        System.out.println("Input Array");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<len;i++)
        {
            System.out.print("Cell <"+(i+1)+"> [int] ");
            ar[i]=sc.nextInt();
        }
    }

    /**
     * Method common
     *
     * @param c Collection object
     * @return Common Collection
     */
    Collection common(Collection c)
    {
        int ctr=0;
        for(int i=0;i<this.len;i++)
        {
            for(int j=0;j<c.len;j++)
                if(this.ar[i]==c.ar[j])
                    ctr++;
        }
        Collection a=new Collection(ctr);
        int k=0;
        for(int i=0;i<this.len;i++)
        {
            for(int j=0;j<c.len;j++)
                if(this.ar[i]==c.ar[j])
                    a.ar[k++]=this.ar[i];
        }
        return a;//common collection of this object and parameter's object
    }

    /**
     * Method display
     * displays array
     */
    void display()
    {
        for(int i=0;i<len;i++)
        {
            System.out.print(ar[i]+"|");
        }
    }

    /**
     * Method main
     * method executed at runtime
     * @param args A parameter
     */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("COLLECTION 1");
        System.out.print("Length [int] ->");
        int n1=sc.nextInt();
        Collection a=new Collection(n1);
        a.input();
        System.out.println("------\nCOLLECTION 2");
        System.out.print("Length [int] ->");
        int n2=sc.nextInt();
        Collection b=new Collection(n2);
        b.input();//user input of Collection class array
        System.out.println("------\nCOLLECTION COMMON");
        Collection c=new Collection();
        c=a.common(b);
        c.display();//displays common of collections
    }
}