import java.util.*;
public class IT
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("INCOME TAX CALCULATOR\n\nEnter Gross Annual Income: ");
        double gross=x.nextDouble();double tax=0;
        if(gross<=100000)
        tax=0;
        else if(gross>100000 && gross<=150000)
        tax=0.10*(gross-100000);
        else if(gross>150000 && gross<=200000)
        tax=(0.20*(gross-150000))+5000;
        else
        tax=(0.30*(gross-200000))+15000;
        double net=gross-tax;
        System.out.println("Tax to be paid = Rs."+tax+"\nNet Annual Income (excluding tax) = Rs."+net);
    }
}
