import java.util.*;
public class Array
{
    static Arrayer a;
    /**
     * Constructor for objects of class Array
     */
    public Array()
    {
    }

    /**
     * Menu Drien Interface
     */
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("---MENU---");
        System.out.println("1 - Insert elements into array");
        System.out.println("2 - Delete elements from array");
        System.out.println("3 - Print elements of array");
        System.out.println("0 - Exit");
        System.out.print("\nEnter your choice : ");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
            System.out.print("\nEnter size of array : ");
            int size=s.nextInt();
            a=new Arrayer(size);
            System.out.print("\nEnter array's elements.");
            a.insertElements();
            break;
            case 2:
            System.out.print("\nEnter position of array's element to delete : ");
            int pos=s.nextInt()-1;
            a.deleteElement(pos);
            break;
            case 3:
            System.out.print("\nElements of the array.");
            a.printElements();
            break;
            case 0:
            System.exit(0);
            break;
            default:
            System.out.print("\nInvalid Choice! Please Retry.\n\n");
        }
    }
}
class Arrayer
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
