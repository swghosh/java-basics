import java.util.*;
public class Convert {
   long bin;
   long dec;
   Convert() {
       bin = dec = 0;
   }
   void input() {
       System.out.print("Enter a binary number -> ");
       bin = new Scanner(System.in).nextLong();
   }
   long convert(long n) {
       if(n == 1 || n == 0) return n;
       else return (2 * convert(n / 10)) + convert(n % 2);
   }
}