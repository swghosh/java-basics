import java.util.*;

public class StringPermute {
    static void permute(String prefix, String str) {
        if(prefix.length() != str.length()-1) {
            for(int i=0; i < str.length(); i++) {
                permute(prefix + str.charAt(i), str);
            }
        }
        else {
            for(int i=0; i < str.length(); i++) {
                System.out.println(prefix + str.charAt(i));
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("__ANAGRAM__");
        System.out.print("Word -> ");
        String word = new Scanner(System.in).next();
        permute("", word);
    }
}