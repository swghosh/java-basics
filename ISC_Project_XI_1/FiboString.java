import java.util.*;
public class FiboString
{
    String x,y,z;int n;
    /**
     * FiboString Constructor
     *
     */
    FiboString()
    {
        x="a";y="b";z=x+y;
    }

    /**
     * Method accept
     *
     */
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Limit [int]->");
        n=sc.nextInt();//accepts linit of Fibonnaci
    }

    /**
     * Method generate
     *
     */
    void generate()
    {
        String s0=x;
        String s1=y;
        String s2=z;
        System.out.print("\n"+s0+","+s1);
        for(int i=2;i<n;i++)
        {
            s2=s1+s0;
            System.out.print(","+s2);
            s0=s1;
            s1=s2;
        }//generates Fibonnaci string
    }

    /**
     * Method main
     * method is executed at runtime
     * @param args Arguments
     */
    public static void main(String args[])
    {
        System.out.println("FIBOSTRING");
        FiboString f=new FiboString();
        f.accept();
        f.generate();//prints FiboString
    }
}