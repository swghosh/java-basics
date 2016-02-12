import java.util.*;
public class SpecialNo
{
    public int sumOfDigits(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public int productOfDigits(int n)
    {
        int sum=1;
        while(n>0)
        {
            sum=sum*(n%10);
            n=n/10;
        }
        return sum;
    }
    public int countDigits(int n)
    {
        int i=0;
        while(n>0)
        {
            i++;
            n=n/10;
        }
        return i;
    }
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("SPECIAL NO.\n\nEnter a no. : ");
        int n=x.nextInt();
        if (countDigits(n)==2)
        {
            int sum=sumOfDigits(n)+productOfDigits(n);
            System.out.println(((sum==n)?("It is a special two digit number."):("It is not a special two digit number.")));
        }
        else
        {
            System.out.println("Please retry with a two digit no.\n\n");
            main();
        }
    }
}
