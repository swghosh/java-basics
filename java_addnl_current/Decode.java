import  java.util.*;
public class Decode
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the code");
        int N=sc.nextInt();
        System.out.println("Enter the code");
        String str=sc.next();
        System.out.println("N ="+N);
        System.out.println(str);
        if(N<=6)
        {
            if(N==str.length())
            {
                char ch=' ';int k=0;
                for(int i=0;i<N;i++)
                {
                    ch=str.charAt(i);
                    if(ch=='A'||ch=='C'||ch=='E'||ch=='G'||ch=='I'||ch=='K')
                        k=k+1;
                    else if(ch=='a'||ch=='c'||ch=='e'||ch=='g'||ch=='i'||ch=='k')
                        k=k+10;
                    else
                        k=k+100;
                }
                if(k==N)
                    System.out.println("Valid");
                if(k>10 && k<100)
                    System.out.println("Invalid!Contains letters in lower case");
                if(k>100)
                    System.out.println("Invalid!Has letters other than 'A','C','E','G','I','K'");
            }
            else
                System.out.println("Code length doesn't match desired length");
        }
        else
            System.out.println("Code length cannot exceed 6");
    }

}

