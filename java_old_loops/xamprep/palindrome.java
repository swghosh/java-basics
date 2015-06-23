package xamprep;
import java.util.*;
/**
 * Write a description of class palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class palindrome
{
   public int revNo(int n)
   {
       int rev=0,rem=0;
       for(int i=n;i>0;i=i/10)
       {
           rem=i%10;
           rev=(rev*10)+rem;
       }
       return rev;
   }
   public void checkPalindrome()
   {
       Scanner x=new Scanner(System.in);
       System.out.print("\nEnter a no.: ");
       int n=x.nextInt();
       if(n==revNo(n))
       System.out.print("\nPalindrome No.");
       else
       System.out.print("\nNot Palindrome No.");
   }
   public boolean isPalindrome(int n)
   {
       boolean flag=false;
       if(n==revNo(n))
       flag=true;
       return flag;
   }
   public void seriesPalindrome() 
   {
       for(int i=10;i<=2014;i++)
       {
           if (isPalindrome(i))
           System.out.println(i);
       }
   }
}
