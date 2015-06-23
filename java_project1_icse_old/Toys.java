import java.util.*;
public class Toys
{
    double per=0;
    public Toys(int sale,int produced)
    {
        per=(sale*100)/produced;
    }
    public void display()
    {
        String str="";
        if(per>85)
        str="Very Good";
        else if(per>65 && per<=85)
        str="Good";
        else if(per>40 && per<=65)
        str="Average";
        else
        str="Poor";
        System.out.print("Percentage Sale = "+per+"% Rating = "+str);
    }
    public void main()
    {
        Scanner x=new Scanner(System.in);
        int robosales,roboproduct,carsales,carproduct,legosales,legoproduct,dollsales,dollproduct;
        System.out.print("PRODUCT SALES RATING\n\nEnter no. of robots sold : ");
        robosales=x.nextInt();
        System.out.print("\nEnter no. of robots produced : ");
        roboproduct=x.nextInt();
        System.out.print("\nEnter no. of cars sold : ");
        carsales=x.nextInt();
        System.out.print("\nEnter no. of cars produced : ");
        carproduct=x.nextInt();
        System.out.print("\nEnter no. of lego sold : ");
        legosales=x.nextInt();
        System.out.print("\nEnter no. of lego produced : ");
        legoproduct=x.nextInt();
        System.out.print("\nEnter no. of dolls sold : ");
        dollsales=x.nextInt();
        System.out.print("\nEnter no. of dolls produced : ");
        dollproduct=x.nextInt();
        Toys Robot=new Toys(robosales,roboproduct);
        Toys Car=new Toys(carsales,carproduct);
        Toys Lego=new Toys(legosales,legoproduct);
        Toys Doll=new Toys(dollsales,dollproduct);
        System.out.print("\n\nRobots : ");Robot.display();
        System.out.print("\n\nCars : ");Car.display();
        System.out.print("\n\nLego : ");Lego.display();
        System.out.print("\n\nDolls : ");Doll.display();
    }
}
