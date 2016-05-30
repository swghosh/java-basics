import java.util.*;
import java.io.*;
import java.nio.file.*;

public class MUNFlagManip {
    
    static String[][] countriesList = new String[249][2];
    
    public static void generateCountriesList(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        sc.useDelimiter("\n");
        int counter = 0;
        while(sc.hasNext()) {
            String line = sc.next();
            int c = line.lastIndexOf(',');
            countriesList[counter][0] = line.substring(0, c);
            if(countriesList[counter][0].startsWith("\"")) {
                countriesList[counter][0] = countriesList[counter][0].substring(1, countriesList[counter][0].length() -1);
            }
            countriesList[counter][1] = line.substring(c + 1, line.length());
            counter++;
        }
        sc.close();
    }
    
    public static void printCountriesList() {
        for(String[] a : countriesList) {
            System.out.println(a[0] + " : " + a[1]);
        }
    }
    
    public static void renameFlags(String folderPath) throws FileNotFoundException {
        File folder = new File(folderPath);
        File files[] = folder.listFiles();
        for(File f : files) {
            if(f.toString().endsWith(".png") == false) continue;
            String filename = f.toString().substring(f.toString().length() - 6, f.toString().length());
            String filenameShort = filename.substring(0, 2);
            for(String[] c : countriesList) {
                if(filenameShort.equalsIgnoreCase(c[1])) {
                    f.renameTo(new File(folderPath + "/" + c[0] + ".png"));
                }
            }
        }
    }
    
    public static void copySpecificFlagsFromList(String folderFromPath, String folderToPath, String fileListPath) throws IOException, Exception {
        Scanner sc = new Scanner(new File(fileListPath));
        sc.useDelimiter("\n");
        while(sc.hasNext()) {
            String line = sc.next().trim();
            File s = new File(folderFromPath + "/" + line + ".png");
            File d = new File(folderToPath + "/" + line + ".png");
            Files.copy(s.toPath(), d.toPath());
            System.out.println(s.toString() + " -> " + d.toString());
        }
        sc.close();
    }
    
    public static void copySpecificFlagsFromListTraverse(String folderFromPath, String folderToPath, String fileListPath) throws IOException, Exception {
        File folderFrom = new File(folderFromPath);
        File files[] = folderFrom.listFiles();
        Scanner sc = new Scanner(new File(fileListPath));
        sc.useDelimiter("\n");
        while(sc.hasNext()) {
            String line = sc.next().trim().toLowerCase();
            for(File a : files) {
                String b = a.toString().toLowerCase();
                b = b.substring(b.lastIndexOf('/'), b.lastIndexOf('.'));
                if(b.contains(line)) {
                    File d = new File(folderToPath + "/" + b + ".png");
                    Files.copy(a.toPath(), d.toPath());
                    System.out.println(a.toString() + " -> " + d.toString());
                }
            }
        }
        sc.close();
    }
    
    public static void removeLineNumbering(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        sc.useDelimiter("\n");
        while(sc.hasNext()) {
            String line = sc.next().trim();
            if(line == "" || line == null) continue;
            int i = 0;
            for(; i < line.length(); i++) {
                if(Character.isLetter(line.charAt(i))) break;
            }
            System.out.println(line.substring(i));
        }
        sc.close();
    }
    
    public static void main(String args[]) throws FileNotFoundException, IOException, Exception {
        removeLineNumbering("/Users/swg/Desktop/country matrices/GA-DISCEC Voting.txt");
        generateCountriesList("/Users/swg/Desktop/country matrices/country codes.csv");
        printCountriesList();
        renameFlags("/Users/swg/Desktop/country matrices/flags-big");
        copySpecificFlagsFromListTraverse("/Users/swg/Desktop/country matrices/flags-big", "/Users/swg/Desktop/country matrices/ECOSOC", "/Users/swg/Desktop/country matrices/ECOSOC Voting.csv");
        copySpecificFlagsFromListTraverse("/Users/swg/Desktop/country matrices/flags-big", "/Users/swg/Desktop/country matrices/GA-DISEC", "/Users/swg/Desktop/country matrices/GA-DISEC Voting.csv");
    }
}