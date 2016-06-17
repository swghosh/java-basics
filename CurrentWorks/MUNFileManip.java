import java.io.*;
import java.util.*;
public class MUNFileManip {
    public static void capitalizeCSV(String filePath) throws FileNotFoundException {
        File f = new File(filePath);
        Scanner sc = new Scanner(f);
        sc.useDelimiter("\n");
        while(sc.hasNext()) {
            String line = sc.next();
            line = line.substring(0, 1) + line.substring(1, 2).toUpperCase() + line.substring(2);
            System.out.println(line);
        }
    }
}