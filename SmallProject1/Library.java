import java.util.*;
public class Library
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("LIBRARY LATE FEE CALCULATOR\n\nEnter the no. of days: ");
        int n=x.nextInt(),fee=0;
        if(n<=5)
        fee=40*n;
        else if(n>5 && n<=10)
        fee=65*n;
        else
        fee=80*n;
        double feeinrs=fee*0.01;
        System.out.println("Late Fee = Rs."+feeinrs);
        
    }
}
