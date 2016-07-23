import java.util.*;
public class VowelWord
{
    String str;
    int freq;
    int x;
    /**
     * VowelWord Constructor
     *
     */
    VowelWord() {
        str = "";
        freq = 0;
        x = 0;
    }

    /**
     * Method readstr
     * reads a string from user
     */
    void readstr() {
        System.out.print("Sentence [string] ->");
        str = " " + new Scanner(System.in).nextLine().trim();
        if(str.endsWith(".") == false) {
            str = "";
            System.out.println("Invalid Sentence");
        }
    }

    /**
     * Method freq_vowel
     * calculates the frequency of words starting with vowels using recursive technique
     */
    void freq_vowel() {
        if(x == str.length() - 1) return;
        char ch = str.charAt(x);
        boolean s = ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';//Stores whether the character is a vowel or not
        if(s && Character.isWhitespace(str.charAt(x - 1))) freq++;//Checks whether vowel is followed by space
        x = x + 1;
        freq_vowel();
    }

    /**
     * Method display
     * displays the sentence and the frequency of vowel words
     */
    void display() {
        System.out.println(str);
        System.out.println("Frequency of vowel words = " + freq);
    }

    /**
     * Method main
     * method is executed at runtime
     * @param args Arguments
     */
    public static void main(String[] args) {
        System.out.println("VOWEL WORD FREQUENCY");
        VowelWord vw = new VowelWord();
        vw.readstr();//Reads string from user
        vw.freq_vowel();//Calculates the frequency of vowel words
        vw.display();//Displays the sentence and the frequency
    }
}
