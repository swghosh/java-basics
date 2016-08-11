import java.util.Scanner;
class TheString {

    String str;
    int cap;
    int sm;
    
    TheString() {
        str = "";
        cap = 0;
        sm = 0;
    }
    
    void accept() {
        System.out.print("Enter a string -> ");
        str = new Scanner(System.in).nextLine();
    }
    
    void recursive_fn(int n) {
        if(n >= str.length()) {
            return;
        }
        else {
            if(Character.isUpperCase(str.charAt(n))) cap++;
            else if(Character.isLowerCase(str.charAt(n))) sm++;
            recursive_fn(n + 1);
        }
    }
    
    void display() {
        System.out.println("Capital Letters = " + cap);
        System.out.println("Small Letters = " + sm);
    }
}