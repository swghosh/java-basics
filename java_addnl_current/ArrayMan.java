import java.util.*;
public abstract class ArrayMan
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        Arrayer a[]=null;
        while(true)
        {
            System.out.println("\n--------------------------------------------\n\n\tARRAY MAN");
            System.out.println("1-Declare Array and Insert Elements");
            System.out.println("2-Insert Element");
            System.out.println("3-Delete Element");
            System.out.println("4-Merge Arrays");
            System.out.println("5-Split Array");
            System.out.println("6-Display");
            System.out.println("0-Exit");
            System.out.print("\nChoice ->");int ch=((sc.hasNextInt())?(sc.nextInt()):0);
            switch(ch)
            {
                case 1:
                System.out.print("\nArray Size ->");
                int len=sc.nextInt();
                a=new Arrayer[2];
                a[0]=new Arrayer(len);
                int c[]=new int[len];
                for(int i=0;i<len;i++)
                {
                    System.out.print("Element ("+(i+1)+") ->");
                    c[i]=sc.nextInt();
                }
                a[0].init(c);
                break;
                case 2:
                System.out.print("\nElement to Insert ->");
                int n=sc.nextInt();
                System.out.print("Position of Insertion ->");
                int ins=sc.nextInt();
                a[0].insert(n,ins);
                break;
                case 3:
                System.out.print("\nPosition of Deletion ->");
                int del=sc.nextInt();
                a[0].delete(del);
                break;
                case 4:
                System.out.print("\nArray2 Size ->");
                int len2=sc.nextInt();
                a[1]=new Arrayer(len2);
                int d[]=new int[len2];
                for(int i=0;i<len2;i++)
                {
                    System.out.print("Element ("+(i+1)+") ->");
                    d[i]=sc.nextInt();
                }
                a[1].init(d);
                a[0].merge(a[1]);
                a[1]=new Arrayer();
                break;
                case 5:
                System.out.print("\nPosition to Split ->");
                int sp=sc.nextInt();
                Arrayer b[]=a[0].split(sp);
                a[0]=b[0];
                a[1]=b[1];
                break;
                case 6:
                a[0].display();
                a[1].display();
                break;
                case 0:
                System.exit(0);
                break;
                default:
                System.out.print("\nSomething went wrong!");
                main(null);
            }
        }
    }
}