
public class FolaExceptionTester
{
   public static void main(String[] args)
   {
       try{
       int ctr=0;
       if(ctr==0) throw new FolaException();
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
   }
}
