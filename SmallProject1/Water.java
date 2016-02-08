import java.util.*;
public class Water
{
    public int calculateTax(int units)
    {
        int tax=0;
        if(units>45 && units<=75)
        tax=475;
        else if(units>75 && units<=125)
        tax=750;
        else if(units>125 && units<=200)
        tax=1225;
        else if(units>200 && units<=350)
        tax=1650;
        else
        tax=2000;
        return tax;
    }
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("ANNUAL WATER TAX CALCULATOR\n");
        int tax=0;int sum=0;
        for(int i=1;i<=12;i++)
        {
            System.out.print("\nEnter units consumed in month no. "+i+" : ");
            int units=x.nextInt();
            tax=calculateTax(units);
            System.out.println("Tax for month no. "+i+" = Rs."+tax);
            sum+=tax;
        }
        System.out.println("Total Annual Tax = Rs."+sum);
    }
}
