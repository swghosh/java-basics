import java.util.*;
public class Deranger {
    String s;
    ArrayList<String> l;
    Deranger(String s) {
        this.s = s;
        l = new ArrayList<String>();
    }
    void permuteNoRepeat(String prefix, String str) {
        if(str.length() > 0) {
            for(int i = 0; i < str.length(); i++) {
                permuteNoRepeat(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
            }
        }
        else {
            l.add(prefix);
        }
    }
    void derange() {
        permuteNoRepeat("", this.s);
        for(int i = 0; i < l.size(); i++) {
            String s2 = l.get(i);
            for(int j = 0; j < s2.length(); j++) {
                if(s2.charAt(j) == this.s.charAt(j)) {
                    l.remove(i--);
                    break;
                }
            }
        }
    }
}