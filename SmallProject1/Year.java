import java.util.*;
public class Year
{
    public String dayOfWeek(int n)
    {
        String str="";
            if (n==1)
            str="Monday";
            else if (n==2)
            str="Tuesday";
            else if (n==3)
            str="Wednesday";
            else if (n==4)
            str="Thursday";
            else if (n==5)
            str="Friday";
            else if (n==6)
            str="Saturday";
            else if (n==0)
            str="Sunday";
        return str;
    }
    public boolean isLeapYear(int yr)
    {
        boolean flag=false;
        if (yr%4==0)
        flag=true;
        if (yr%100==0)
        {
            if(yr%400!=0)
            flag=true;
            else
            flag=false;
        }
        return flag;
    }
    public int indexOfFeb28()
    {
        int sum=2;//Initializing sum to 2 since 1st Jan'13 is Tuesday & indexOfTuesday=2
        for(int i=2014;i<2021;i++)
        {
            sum+=(isLeapYear(i))?366:365;//Adding days from the in-between years
        }
        sum+=31+28;//Adding days from Jan'21 & Feb'21
        int day=(sum%7);
        return day;
    }
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("LEAP YEAR CALCULATOR\n\nThe 28th February of 2021 is "+dayOfWeek(indexOfFeb28())+"\nEnter a year : ");
        int yr=x.nextInt();
        System.out.println((isLeapYear(yr))?"The year is a leap year.":"The year is not a leap year.");        
    }
}
