import java.util.*;
public class Star
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       boolean f[][]=new boolean[10][13];
       for(int i=0;i<10;i++)
       {
           for(int j=0;j<13;j++)
           {
               System.out.print((i+1)+","+(j+1)+" : ");
               if(sc.next().charAt(0)=='t') f[i][j]=true; else f[i][j]=false;
           }
       }
       for(int i=0;i<10;i++)
       {
           for(int j=0;j<13;j++)
           {
               System.out.print((f[i][j])?"* ":"  ");
           }
           System.out.println();
       }
   }
}
