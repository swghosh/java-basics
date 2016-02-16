import java.util.*;

public class LastCharacter {
    public static String lastChar(String s) {
        if(s.trim().length() == 0) return "";
        if(Character.isWhitespace(s.charAt(s.length() - 1)) == false) s = s + " ";
        int index = s.indexOf(" ") + 1;
        String currentWord = s.substring(0, index);
        return currentWord.charAt(index - 2) + lastChar(s.substring(index));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(lastChar(sentence));
    }
}