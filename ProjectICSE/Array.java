import java.util.*;
public class Array
{
    Arrayer a=new Arrayer(1);
    /**
     * Constructor for objects of class Array
     */
    public Array()
    {
    }

    /**
     * Menu Drien Interface
     */
    public void main()
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
