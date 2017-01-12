import java.io.*;
import java.util.*;

public class TwoStrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        for(int i = 0; i < l; i++) {
            System.out.println(l);
            String a = sc.next();
            String b = sc.next();
            boolean flag = false;
            for(int j = 0; j < a.length() && !flag; i++) {
                if(b.contains(a.charAt(j) + "")) flag = true;
            }
            System.out.println(((flag)? "YES" : "NO"));
        }
    }
}