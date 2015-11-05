import java.io.*;
import java.util.*;

public class FileIO {
    
    static void writeFile() throws IOException {
        Scanner sc = new Scanner(System.in);
        File f = new File(System.getenv("userprofile")+"/Desktop/Tester.txt");
        FileWriter fw = new FileWriter(f,true);
        System.out.print("Text ->");
        String str = sc.nextLine();
        fw.write(str);
        fw.close();
    }
    
    static void readFile() throws FileNotFoundException {
        File f = new File(System.getenv("userprofile")+"/Desktop/Tester.txt");
        FileReader fr = new FileReader(f);
        Scanner sc = new Scanner(fr);
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
        
}
        
        