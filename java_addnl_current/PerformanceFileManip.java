import java.io.*;
import java.util.*;

public class PerformanceFileManip {

    public static void main(String[] args) throws IOException {
        /*
         * User Input and % Manipulation
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Name ->");
        String s = sc.next();
        System.out.print("Marks of Subject1 ->");
        int s1 = sc.nextInt();
        System.out.print("Marks of Subject2 ->");
        int s2 = sc.nextInt();
        System.out.print("Marks of Subject3 ->");
        int s3 = sc.nextInt();
        int total = s1 + s2 + s3;
        double percent = total * 0.3333333333;
        /*
         * Write Info to File
         */
        File f = new File(System.getenv("userprofile")+"/Desktop/Performance.txt");
        FileWriter fw = new FileWriter(f,true);
        String write = s + "\t" + Integer.toString(s1) + "\t" + Integer.toString(s2) + "\t" + Integer.toString(s3) + "\t" + Integer.toString(total) + "\t" + Double.toString(percent) + "\n";
        fw.write(write);
        fw.close();
        /*
         * Read all Existing Records
         */
        f = new File(System.getenv("userprofile")+"/Desktop/Performance.txt");
        FileReader fr = new FileReader(f);
        Scanner sc2 = new Scanner(fr);
        while(sc2.hasNextLine()) {
            System.out.println(sc2.nextLine());
        }
        sc.close();
    }
}

       