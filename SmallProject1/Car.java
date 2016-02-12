import java.util.*;
public class Car
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("SALE&PURCHASE\tDEPRECIATED PRICE CALCULATOR\n\nEnter showroom price of car : ");
        double pr=x.nextDouble();
        System.out.print("\nEnter number of years used : ");
        int n=x.nextInt();
        double amt=0;
        if(n==1)
        amt=pr-(0.1*pr);
        else if(n==2)
        amt=pr*(1-0.1)*(1-0.2);
        else if(n==3)
        amt=pr*(1-0.1)*(1-0.2)*(1-0.3);
        else if(n==4)
        amt=pr*(1-0.1)*(1-0.2)*(1-0.3)*(1-0.4);
        else if(n==5)
        amt=pr*(1-0.1)*(1-0.2)*(1-0.3)*(1-0.4)*(1-0.5);
        else
        amt=pr*((1-0.1)*(1-0.2)*(1-0.3)*(1-0.4)*(1-0.5)*Math.pow((1-0.6),(n-5)));
        System.out.println("Depreciated Price = Rs."+amt);
    }
}
