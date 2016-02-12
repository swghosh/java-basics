import java.util.*;
public class Pincode
{
    public static void main(String args[])//Main method to be executed
    {
        System.out.println("---CITY PINCODE---");
        int pincode[]={700000,600000,110000,300000};//Array stores pin codes
        String city[]={"Kolkata","Mumbai","New Delhi","Chennai"};//Array stores city names
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter a city name : ");//User Input to search city
        String c=sc.next();boolean found=false;
        for(int i=0;i<city.length;i++)
        {
            if(c.equalsIgnoreCase(city[i]))
            {
                System.out.println(city[i]+" : "+pincode[i]);
                found=true;
                break;
            }
        }
        System.out.print((found)?"":"Pincode of selected city not found.");
    }
}