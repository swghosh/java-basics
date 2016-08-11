import java.util.Scanner;
class RevString {

    String str;
    String rev;
    
    RevString() {
        str = rev = "";
    }
    
    RevString(String str) {
        this.str = str;
        rev = "";
    }
    
    void accept() {
        System.out.print("Enter a string -> ");
        str = new Scanner(System.in).nextLine();
    }
    
    void rec_rev(int n) {
        if(n >= str.length()) {
            return;
        }
        else {
            rec_rev(n + 1);
            rev = rev + str.charAt(n);
        }
    }
    
    void check() {
        System.out.println(((rev.equals(str))?"Palindrome.":"Not a palindrome."));
    }
}