public class Encryption
{
    public static String encrypt(String str,int shift)
    {
        if(!(shift>=1 && shift<=26)) shift=0;   
        str=str.toUpperCase().trim();
        String code="";
        str=str.replaceAll(" ","QQ");
        char alpha[]=new char[27];
        char beta[]=new char[27];
        int k=shift;
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
        String encrypted="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int j=(int)ch-64;
            encrypted=encrypted+beta[j];
        }
        String enc2="";
        for(int i=0;i<encrypted.length();i++)
        {
            if((i+1)%6==0) enc2=enc2+encrypted.charAt(i)+" ";
            else enc2=enc2+encrypted.charAt(i);
        }
        return enc2;
    }

    public static String decrypt(String code,int shift)
    {
        String ptext="";
        code=code.toUpperCase().trim().replaceAll(" ","");
        for(int i=0;i<code.length();i++)
        {
            char ch=code.charAt(i);
            int n=(int)ch;
            n=n-64;
            ptext=ptext+decrypt(ch,shift);
        }
        ptext=ptext.replaceAll("QQ"," ").trim();
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
}