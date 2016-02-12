import java.util.*;
public class AlphabeticalOrder
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("ALPHABETICAL STRINGS ORDER\n\nEnter a string : ");
        String str1=x.next();
        System.out.print("\nEnter another string : ");
        String str2=x.next();
        int n=str1.compareTo(str2);
        System.out.println("\nIn Alphabetical Order\n"+((n<=0)?("# "+str1+"\n# "+str2):("# "+str2+"\n# "+str1)));
    }
}
