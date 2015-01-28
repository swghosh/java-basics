import java.util.*;
public class Flat
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("FLAT PRICE CALCULATOR\n\nEnter price : ");
        double price=x.nextDouble();
        System.out.print("\nEnter floor level : ");
        int floor=x.nextInt();
        double disc=0,dev=0;
        switch (floor)
        {
            case 0:
            disc=0.1*price;dev=0.08*price;
            break;
            case 1:
            disc=0.02*price;dev=0.01*price;
            break;
            case 2:
            disc=0.05*price;dev=0.05*price;
            break;
            case 3:
            disc=0.075*price;dev=0.1*price;
            break;
            default:
            System.out.println("Invalid Choice. Please Retry \n\n\n");
            main();
        }
        double net=price+dev-disc;
        System.out.println("The final price of flat is = Rs."+net+"\nDiscount = Rs."+disc+"\nDevelopmentCharge = Rs."+dev);
    }
}
