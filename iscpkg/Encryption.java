import java.util.*;
public class Encryption
{
    public static String decrypt(int shift,String code)
    {
        String ptext="";
        code=code.toUpperCase().trim().replace(" ","");
        for(int i=0;i<code.length();i++)
        {
            char ch=code.charAt(i);
            int n=(int)ch;
            n=n-64;
            ptext=ptext+decrypt(ch,shift);
        }
        ptext=ptext.replace("QQ"," ").trim();
        return ptext;
    }

    public static char decrypt(char c,int shift)
    {
        char alpha[]=new char[27];
        char beta[]=new char[27];
        int k=shift;
        char c2=' ';
        for(int i=0;i<26;i++)
        {
            alpha[i+1]=(char)(65+i);
        }
        int h=1;
        for(;k<beta.length;h++)
        {
            beta[k++]=alpha[h];
        }
        for(k=1;k<shift;h++)
        {
            beta[k++]=alpha[h];
        }
        for(int i=1;i<beta.length;i++)
        {
            if(beta[i]==c)
                c2=alpha[i];
        }
        return c2;
    }

    public static void main(String args[])
    {
        System.out.println("DECRYPTOR");
        System.out.print("Shift value [int] ->");
        int shift=new Scanner(System.in).nextInt();
        System.out.print("Encrypted text [string] ->");
        String str=new Scanner(System.in).nextLine();
        System.out.println("Decrypted Text = "+decrypt(shift,str));
    }
}