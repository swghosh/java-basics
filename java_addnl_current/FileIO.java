import java.io.*;
import java.util.*;

public class FileIO {
    
    static void writeFile() throws IOException {
        Scanner sc = new Scanner(System.in);
        File f = new File(System.getenv("userprofile")+"/Desktop/File1.txt");
        FileWriter fw = new FileWriter(f,true);
        System.out.print("Text ->");
        String str = sc.nextLine();
        fw.write(str);
        fw.close();
    }
    
    static void readFile() throws FileNotFoundException {
        File f = new File(System.getenv("userprofile")+"/Desktop/File1.txt");
        FileReader fr = new FileReader(f);
        Scanner sc = new Scanner(fr);
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
    
    static void makeDirectory() {
        File dir = new File(System.getenv("userprofile")+"/Desktop/Folder");
        dir.mkdir();
    }
    
    static void copyFile() throws FileNotFoundException,IOException {
        File from = new File(System.getenv("userprofile")+"/Desktop/File1.txt");
        File to = new File(System.getenv("userprofile")+"/Desktop/File2.txt");
        FileReader fr = new FileReader(from);
        FileWriter fw = new FileWriter(to);
        Scanner sc = new Scanner(fr);
        while(sc.hasNextLine()) {
            fw.write(sc.nextLine());
        }
    }
    
}
       