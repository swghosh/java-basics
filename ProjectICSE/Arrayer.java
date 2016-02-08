import java.util.*;
public class Arrayer
{
    int ar[];
    int size;
    int delete=0;
    /**
     * Constructor for objects of class Arrayer
     * @param n  size of array ar[]
     */
    public Arrayer(int n)
    {
        size=n;
        ar=new int[size];
    }

    /**
     * Insert elements into array ar[]
     */
    public void insertElements()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print("\nEnter array element no. "+(i+1)+" : ");
            ar[i]=new Scanner(System.in).nextInt();
        }
    }

    /**
     * Delete element from array ar[pos]
     * @param pos   position of array element to delete
     */
    public void deleteElement(int pos)
    {
        if(pos<0||pos>=size-delete)
            return;
        delete++;
        for(int i=pos;i<size-1;i++)
            ar[i]=ar[i+1];
        ar[size-delete]=0;
    }

    /**
     * Print elements from array ar[]
     */
    public void printElements()
    {
        System.out.print("\n{");
        for(int i=0;i<size-delete;i++)
        {
            if(i==(size-delete-1))
                System.out.print(ar[i]);
            else
                System.out.print(ar[i]+",");
        }
        System.out.print("}");
    }
}
