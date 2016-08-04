import java.util.*;
class StringSubtract {

    static String subtract(String str1, String str2) {

        int x = str1.indexOf(str2);

        if(x == -1) {
            System.err.println("Substring not found inside given String so not subtracted. Original string returned.");
            return str1;
        }

        int l = str2.length();

        String str3 = str1.substring(0, x) + str1.substring(x+l);

        return str3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String1 -> ");
        String str1 = sc.nextLine();
        
        sc.close();
        sc = new Scanner(System.in);

        System.out.print("String2 -> ");
        String str2 = sc.nextLine();

        String output = subtract(str1, str2);
        System.out.println(output);
    }
}
