import java.util.Scanner;
class Check {

    String str; int w;

    void disp() {
        counter(0);
        System.out.println(w);
    }

    void inputString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sentence -> ");
        str = " " + sc.nextLine().trim(); // additional space added at the beginning to consider the first word
    }

    void counter(int i) {
        if(i >= str.length() - 1) {
            return;
        }
        else {
            char ch = str.charAt(i);
            char ch2 = str.charAt(i + 1);
            String vowelCaps = "AEIOU";
            if(Character.isWhitespace(ch) && (vowelCaps.indexOf(ch2) != -1)) {
                w = w + 1; // w incremented on finding a capital vowel starting word
            }
            counter(i + 1);
        }
    }

}