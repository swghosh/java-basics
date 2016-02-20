import java.util.*;
public class Derangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter for n : ");
        int n = sc.nextInt();
        String str = "";
        for(int i = 0; i < n; i++) {
            str = str + Integer.toString(i);
        }
        Deranger d = new Deranger(str);
        d.derange();
        for(Object s : d.l.toArray()) {
            System.out.print("{");
            String s1 = s.toString();
            for(int i = 0; i < s1.length(); i++) {
                System.out.print(s1.charAt(i) + ",");
            }
            System.out.print("}" + "\n");
        }
    }
}
