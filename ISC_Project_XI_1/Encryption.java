import java.util.*;
public class Encryption
{
    /**
     * Method decrypt
     *
     * @param shift Shift Value
     * @param code String to be decrypted
     * @return Decrypted string
     */
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
        }//decrypts each character
        ptext=ptext.replace("QQ"," ").trim();
        return ptext;
    }

    /**
     * Method decrypt
     *
     * @param c Character to decrypt
     * @param shift Shift Value
     * @return Decrypted character
     */
    public static char decrypt(char c,int shift)
    {
        char alpha[]=new char[27];
        char beta[]=new char[27];
        int k=shift;
        char c2=' ';
        for(int i=0;i<26;i++)//loop for character
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
        }//decrypt
        return c2;
    }

    /**
     * Method main
     * method is executed at runtime
     * @param args Arguments
     */
    public static void main(String args[])
    {
        System.out.println("DECRYPTOR");
        System.out.print("Shift value [int] ->");//user input of shift value
        int shift=new Scanner(System.in).nextInt();
        System.out.print("Encrypted text [string] ->");//user input of encrypted text
        String str=new Scanner(System.in).nextLine();
        System.out.println("Decrypted Text = "+decrypt(shift,str));//decrypted text as output
    }
}