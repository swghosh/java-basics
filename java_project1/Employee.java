import java.util.*;
public class Employee
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("GROSS SALARY CALCULATOR\n\nEnter basic salary : ");
        double bas=x.nextDouble();double da=0,sa=0,gross=0;
        if (bas<10000)
        {
            da=0.1*bas;sa=0.05*bas;
        }
        else if (bas>10000 && bas<20000)
        {
            da=0.12*bas;sa=0.08*bas;
        }
        else if (bas>20000 && bas<30000)
        {
            da=0.15*bas;sa=0.1*bas;
        }
        else
        {
            da=0.2*bas;sa=0.12*bas;
        }
        gross=bas+da+sa;
        System.out.println("BASIC\t\tDA\t\tSA\t\tGROSS\nRs."+bas+"\tRs."+da+"\tRs."+sa+"\tRs."+gross);
    }
}
