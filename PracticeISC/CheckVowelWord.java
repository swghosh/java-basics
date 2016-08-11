import java.util.Scanner;
class CheckVowelWord {
    String str;
    int w;
    void inputString() {
        System.out.print("Enter a string -> ");
        str = " " + new Scanner(System.in).nextLine().trim();
    }
    void counter(int c) {
        if(c >= str.length())  return;
        else {
            if(Character.isWhitespace(str.charAt(c))) {
                char ch = str.charAt(c + 1);
                boolean isCapitalVowel = ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
                if(isCapitalVowel) w++;
            }
            counter(c + 1);
        }
    }
    void display() {
        counter(0);
        System.out.println("String -> " + str);
        System.out.println("Number of words starting in capital vowels : " + w); 
    }
    public static void main(String[] args) {
        CheckVowelWord c = new CheckVowelWord();
        c.inputString();
        c.display();
    }
}