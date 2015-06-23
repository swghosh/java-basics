import java.util.*;
public class UniqueNo
{
   public boolean isUniqueNo(int n)
   {
       int i=n,j=0;int ctr[]=new int[10];boolean flag=true;
       while(i>0)
       {
           j=i%10;
           for(int f=0;f<=9;f++)
           {
               if(f==j)
               ctr[f]+=1;
           }
           i=i/10;
       }
       for(int y=0;y<=9;y++)
       {
           if(ctr[y]>1)
           flag=false;
       }
       return flag;
   }
   public int countDigits(int n)
   {
        int i=0;
        while(n>0)
        {
            i++;
            n=n/10;
        }
        return i;
   }
   public void main()
   {
       Scanner x=new Scanner(System.in);
       System.out.print("UNIQUE NUMBER CALCULATOR\n\nEnter a no. : ");
       int n=x.nextInt();
       String str=(isUniqueNo(n))?"Unique no.":"Not a Unique no.";
       System.out.println(str);
   }
}
