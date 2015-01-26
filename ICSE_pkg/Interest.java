/** To find simple and compound interest
 * for first and second year */
public class Interest
{
public static void main (double p,double t)
{
//The rate is fixed to 5% per annum
double si,amt;si=0.0;amt=0.0;
int r;r=5;
/*SI=(P*R*T)/100 .. Formuala (given)
* Amount=SI+P .. Formula (given)
*/
si=(p*r*t)/100;amt=p+si;
System.out.println("Rate is fixed to 5% per Annum");
System.out.println("Interest="+si);
System.out.println("Amount="+amt);
}
}