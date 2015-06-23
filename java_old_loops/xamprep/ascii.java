package xamprep;


/**
 * Write a description of class ascii here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ascii
{
    public String[] main(int n)
    {
        String ar[]=new String[256];
        for(int i=1;i<256;i++)
        ar[i]=""+(char)(i);
        return ar;
    }
    public void main()
    {
        ascii ob=new ascii();
        String args[]=ob.main(2);
        for(int i=1;i<256;i++)
        System.out.println(i+" - "+args[i]);
    }
}
