 
import java.io.*;
import java.util.*;
public class FileIO2
{
     static void readFile() throws IOException {
        try {
            File f = new File(System.getenv("userprofile")+"/Desktop/LL2.out.txt");
            FileReader fr = new FileReader(f);
            Scanner sc = new Scanner(fr);
            while(sc.hasNextLine()) {
                String str=sc.nextLine();
                System.out.println(str);
            }
            sc.close();
        }
        catch (FileNotFoundException fe) {
            System.out.println("File Not Found");
        }
    }
}
