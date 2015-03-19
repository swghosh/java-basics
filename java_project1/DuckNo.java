import java.util.*;
public class DuckNo
{
   public boolean isDuck(int n)
   {
       boolean flag=false;
       while(n>0)
       {
           if(n%10==0)
           flag=true;
           n=n/10;
       }
       return flag;
   }
   public void main()
   {
       Scanner x=new Scanner(System.in);
       System.out.print("DUCK NUMBER CALCULATOR\n\nEnter a no. : ");
       int n=x.nextInt();
       String str=(isDuck(n))?"Duck no.":"Not a Duck no.";
       System.out.println(str);
   }
}
