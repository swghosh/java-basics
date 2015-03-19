import java.util.*;
public class InsertDelete
{
    static Arrayer arr;//Static object of class Arrayer
    public static void main(String args[])//Main method to be executed
    {
        arr=null;boolean dont_exit=true;
        Scanner sc=new Scanner(System.in);
        //Menu
        do
        {
            System.out.println("---MENU---");
            System.out.println("1-Declare Array");
            System.out.println("2-Read Elements");
            System.out.println("3-Insert Element");
            System.out.println("4-Delete Element");
            System.out.println("5-Display Elements");
            System.out.println("0-Exit");
            System.out.print("Enter your choice : ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.print("\nEnter size of array : ");
                arr=new Arrayer(sc.nextInt());
                break;
                case 2:
                arr.readElements();
                break;
                case 3:
                System.out.print("\nEnter position of element to insert : ");
                int pos=sc.nextInt();
                System.out.print("\nEnter element to insert : ");
                int n=sc.nextInt();
                arr.insertElement(n,pos-1);
                break;
                case 4:
                System.out.print("\nEnter position of element to delete : ");
                arr.deleteElement(sc.nextInt());
                break;
                case 5:
                arr.displayElements();
                break;
                case 0:
                dont_exit=false;
                break;
                default:
                System.out.println("Invalid Choice\n");
            }
        }
        while(dont_exit);
    }
}
class Arrayer
{
    int ar[];int size;
    public Arrayer(int size_of_array)//Constructor of class Arrayer
    {
        ar=new int[30];
        size=size_of_array;
    }
    public void readElements()//Read elements into array
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nENTER ARRAY ELEMENTS...");
        for(int i=0;i<size;i++)
        {
            System.out.print("\nEnter array element no. "+(i+1)+" : ");
            ar[i]=sc.nextInt();
        }
    }
    public void insertElement(int n,int pos)//Insert an element into array
    {
        for(int i=pos;i<size;i++)
        {
            ar[i+1]=ar[i];
        }
        ar[pos]=n;
        size++;
    }
    public void deleteElement(int pos)//Delete an element from the array
    {
        for(int i=pos-1;i<size;i++)
        {
            ar[i]=ar[i+1];
        }
        size--;
    }
    public void displayElements()//Display elements of the array
    {
        System.out.print("\nARRAY ELEMENTS\n");
        for(int i=0;i<size;i++)
        {
            System.out.print(ar[i]+"|");
        }
        System.out.println();
    }
}
