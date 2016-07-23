import java.util.*;
public class Frequency2
{
    String text;
    int countand;
    int countan;
    int len;
    /**
     * Frequency2 Constructor
     *
     */
    Frequency2() {
        text = "";
        len = 0;
        countand = countan = 0;
    }

    /**
     * Method accept
     * accepts a string
     * @param n assigns it to text
     */
    void accept(String n) {
        text = " " + n.trim() + " ";
        len = 0;
    }

    /**
     * Method checkandfreq
     * checks the frequency of word and using recursive technique
     */
    void checkandfreq() {
        if(len == text.length() - 2) return;
        if(Character.isWhitespace(text.charAt(len))) {
            String i = text.substring(len).substring(1);//Makes substring from position len
            i = i.substring(0, i.indexOf(' '));//Makes string only upto the occurence of next space
            if(i.equalsIgnoreCase("and")) countand = countand + 1;
        }
        len = len + 1;
        checkandfreq();
    }

    /**
     * Method checkanfreq
     * checks the frequency of word an using recursive technique
     */
    void checkanfreq() {
        if(len == text.length() - 2) return;
        if(Character.isWhitespace(text.charAt(len))) {
            String i = text.substring(len).substring(1);//Makes substring from position len
            i = i.substring(0, i.indexOf(' '));//Makes string only upto the occurence of next space
            if(i.equalsIgnoreCase("an")) countan = countan + 1;
        }
        len = len + 1;
        checkanfreq();
    }

    /**
     * Method display
     * displays the frequencies
     */
    void display() {
        System.out.println("Frequency of \"an\" = " + countan);
        System.out.println("Frequency of \"and\" = " + countand);
    }

    /**
     * Method main
     * method is executed at runtime
     * @param args Arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Frequency2 f = new Frequency2();
        System.out.print("Sentence [string] ->");
        f.accept(sc.nextLine());//Takes user input string
        f.checkandfreq();//Checks frequency of word and
        f.len = 0;
        f.checkanfreq();//Checks frequency of word an
        f.display();//Displays frequencies
    }
}
