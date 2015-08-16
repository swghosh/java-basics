import java.io.*;
import java.util.*;
public class SchoolsGen {
    public static void main(String[] args) throws IOException {
        FileInputStream fr=new FileInputStream(new File("schools.txt"));
        Scanner sc=new Scanner(fr);
        sc.useDelimiter("\n");
        int ctr=0;
        while(sc.hasNext()) {
            sc.next();
            ctr++;
        }
        sc.close();
        fr.close();
        
        String id[]=RandSIdGen.randSIdGen(RandSIdGen.randSIdGen(ctr));
        int i=0;
        fr=new FileInputStream(new File("schools.txt"));
        sc=new Scanner(fr);
        sc.useDelimiter("\n");
        while(sc.hasNext()) {
            System.out.print("\n"+sc.next()+" - "+id[i++]);
        }
    }
}