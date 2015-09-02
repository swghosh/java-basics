
/**
 * Write a description of class SysDir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SysDir
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class SysDir
     */
    public SysDir()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void sampleMethod(int y)
    {
        System.out.println(System.getenv("path"));
        System.out.println(System.getProperty("user.dir"));
    }
}
