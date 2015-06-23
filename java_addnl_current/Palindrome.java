import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Sentence ->");
        String str=sc.nextLine();
        sc.close();
        sc=new Scanner(str);
        sc.useDelimiter(" ");
        int ctr=0;
        while(sc.hasNext())
        {
            String word=sc.next();
            if(isPalindrome(word))
            {
                System.out.println(++ctr+". "+word);
            }
        }
        System.out.println("Number of Palindrome Words="+ctr);
    }

    public static boolean isPalindrome(String word)
    {
        StringBuffer sb=new StringBuffer(word);
        sb.reverse();
        return (word.equalsIgnoreCase(sb.toString()))?true:false;
    }
}