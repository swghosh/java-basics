public class CalculatorModel {
    static String calculate(String s){
        if(containsNoOperator(s)) return s;
        String w1 = ""; String w2 = "";
        int ctr = 0;
        char op = '\0';
        boolean flag = true;
        for(int i = 0; i < s.length() && flag; i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                w1 = w1 + ch;
            }
            else if(isOperator(ch)) {
                op = ch;
                for(int j = i + 1; j < s.length(); j++) {
                    char ch2 = s.charAt(j);
                    if(Character.isDigit(ch2)) {
                        w2 = w2 + ch2;
                    }
                    else if(isOperator(ch2)) {
                        ctr = j;
                        flag = false;
                        String remaining = s.substring(j);
                        String n = operate(w1, w2, op);
                        return calculate(n + remaining);
                    }
                    else {
                        return "NaN";
                    }
                }
            }
            else {
                return "NaN";
            }
        }
        return w1;
    }

    static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/');
    }

    static String operate(String w1, String w2, char ch) {
        int n1 = 0, n2 = 0, n = 0;
        try {
            n1 = Integer.parseInt(w1);
            n2 = Integer.parseInt(w2);
        }
        catch(NumberFormatException nfe) {
            n1 = n2 = 0;
            return w1;
        }
        finally {
            if(ch == '+') {
                n = n1 + n2;
            }
            else if(ch == '-') {
                n = n1 - n2;
            }
            else if(ch == '*') {
                n = n1 * n2;
            }
            else if(ch == '/') {
                n = n1 / n2;
            }
        }
        return Integer.toString(n);
    }

    static boolean containsNoOperator(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(isOperator(s.charAt(i))) return false;
        }
        return true;
    }
}
