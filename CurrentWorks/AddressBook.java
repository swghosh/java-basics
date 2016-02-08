import java.io.*;
import java.util.*;
public class AddressBook
{
    public static void main(String[] args) throws Exception,IOException
    {
        System.out.println("Address Book");
        System.out.println("1 - Show all records");
        System.out.println("2 - Add a record");
        System.out.println("3 - Search for a record");
        System.out.println("0 - Exit");
        System.out.print("Choice ->");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        sc.close();sc=new Scanner(System.in);
        switch(ch)
        {
            case 1:
            displayRecords();
            break;
            case 2:
            System.out.print("Name ->");
            String name=sc.nextLine();
            sc.close();
            sc=new Scanner(System.in);
            System.out.print("Number ->");
            long no=sc.nextLong();
            sc.close();
            addRecord(name,no);
            break;
            case 3:
            System.out.print("Name ->");
            String query=sc.nextLine();
            sc.close();
            searchRecord(query);
			break;
            case 0:
            System.exit(0);
            break;
            default:
            System.out.println("Something went wrong! The program will now exit! -_-");
        }
    }
    public static void displayRecords() throws FileNotFoundException
    {
        Scanner sc=new Scanner(new File("records.dat"));
        sc.useDelimiter("\n");
        while(sc.hasNext())
        {
            String str=sc.next();
            Scanner v=new Scanner(str);
            v.useDelimiter(":");
            System.out.print("|\t\t");
            while(v.hasNext())
            {
                System.out.print(Encryption.decrypt((v.next()),7)+"\t\t|\t\t");
                System.out.print(v.next()+"\t\t|\t\t");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void addRecord(String name,long no) throws IOException
    {
        PrintWriter pr=new PrintWriter(new BufferedWriter(new FileWriter("records.dat",true)),true);
        pr.println(Encryption.encrypt(name,7)+":"+no);
        pr.close();
    }
    public static void searchRecord(String name) throws FileNotFoundException
    {
        name=Encryption.encrypt(name,7);
        Scanner sc=new Scanner(new File("records.dat"));
        sc.useDelimiter("\n");
        while(sc.hasNext())
        {
            String str=sc.next();
            Scanner v=new Scanner(str);
            v.useDelimiter(":");
            System.out.print("|\t\t");
            while(v.hasNext())
            {
                String s=v.next();
                if(s.startsWith(name))
                {
                    System.out.print(Encryption.decrypt(s,7)+"\t\t|\t\t");
                    System.out.print(v.next()+"\t\t|\t\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}