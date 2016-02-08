package xamprep;
/**
 * Assumption: Total Marks for subject=100
 */
import java.util.*;
public class marks
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        double p;int tot=0;
        for(int i=1;i<=12;i++)
        {
            System.out.print("\nEnter marks for subject no. "+i+" : ");
            int n=x.nextInt();
            tot=tot+n;
        }
        System.out.print("\nTotal Marks="+tot);
        p=tot/12;
        System.out.print("\nPercentage="+p);
    }
}
