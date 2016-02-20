import java.util.*;

public class Anagram {
    static void permuteNoRepeat(String prefix, String str) {
        if(str.length() > 0) {
            for(int i = 0; i < str.length(); i++) {
                permuteNoRepeat(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
            }
        }
        else {
            System.out.println(prefix);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("__ANAGRAM__");
        System.out.print("Word -> ");
        String word = new Scanner(System.in).next();
        permuteNoRepeat("", word);
    }
}