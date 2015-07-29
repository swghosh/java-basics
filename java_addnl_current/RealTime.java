import java.util.*;
public class RealTime
{
    public static void main(String args[])
    {
        int ctr=0;
        int oldsec=-1;int oldmin=-1;
        while(ctr<5)
        {
            Calendar cd=new GregorianCalendar();
            int h=cd.get(cd.HOUR);
            int m=cd.get(cd.MINUTE);
            int s=cd.get(cd.SECOND);
            if(oldmin!=m)
            {
                ctr++;
                if(oldsec!=s)
                {
                    oldsec=s;
                    oldmin=m;
                    if(cd.get(cd.AM_PM)==0)
                    {
                        System.out.println("\f"+h+":"+m+":"+s+" AM");
                    }
                    else
                    {
                        System.out.println("\f"+h+":"+m+":"+s+" PM");
                    }
                }
                else continue;
            }
            else
            {
                if(oldsec!=s)
                {
                    oldsec=s;
                    oldmin=m;
                    if(cd.get(cd.AM_PM)==0)
                    {
                        System.out.println("\f"+h+":"+m+":"+s+" AM");
                    }
                    else
                    {
                        System.out.println("\f"+h+":"+m+":"+s+" PM");
                    }
                }
                else continue;
            }
        }
        System.out.println("End..");
    }
}