import java.util.*;
public class Sentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Sentence ->");
        String str=sc.nextLine().toUpperCase().trim();sc.close();
        StringTokenizer sb=new StringTokenizer(str);String out1="";
        while(sb.hasMoreTokens()) {
            String word=sb.nextToken();
            out1=out1+" "+word;
        } out1.trim();
        if(!(out1.charAt(out1.length()-1)=='.'||out1.charAt(out1.length()-1)=='!'||out1.charAt(out1.length()-1)=='?')) {
            System.out.println("Invalid Entry");
            return;
        }
        char end=out1.charAt(out1.length()-1);
        out1=out1.substring(0,out1.length()-1);
        System.out.print("Word (to be deleted) ->");sc=new Scanner(System.in);String del=sc.next().trim();
        sb=new StringTokenizer(out1);String out2="";
        while(sb.hasMoreTokens()) {
            String word=sb.nextToken();
            if(!word.equalsIgnoreCase(del)) {
                out2=out2+" "+word;
            }
        } out2=out2+end;
        System.out.println(out2);
    }
}