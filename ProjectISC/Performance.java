import java.io.*;
import java.util.*;

public class Performance {

    /**
     * Method main
     * method is executed at runtime
     * @param args command line aruments
     */
    public static void main(String[] args) {
        try{
            /* User Input and Menu Display */
            Scanner sc = new Scanner(System.in);
            System.out.println("---MENU---\n1-Add Record\n2-Display Records");
            System.out.print("Choice-> ");
            int ch=sc.nextInt();
            switch(ch) {
                case 1:
                /* Add Record */
                {
                    System.out.print("Name ->");
                    String name = sc.next();
                    System.out.print("Marks of Physics ->");
                    int s1 = sc.nextInt();
                    System.out.print("Marks of Chemistry ->");
                    int s2 = sc.nextInt();
                    System.out.print("Marks of Biology ->");
                    int s3 = sc.nextInt();
                    /* Write Info to File */
                    writeRecord(name, s1, s2, s3);
                }
                break;
                case 2:
                /* Read all Existing Records */
                {
                    String[] records = readRecords();
                    System.out.println("NAME\tSUB1\tSUB2\tSUB3\tNET\t%\tGRADE");
                    /* Print the records with their grades */
                    for(int i = 0; i < records.length; i++) {
                        System.out.println(records[i]);
                    }
                }
                break;
            }
            sc.close();
        }
        catch(FileNotFoundException fnfe) {
            System.out.println("The required file wasn't found on your system.");
            System.out.println(fnfe.getMessage());
            System.out.println("Program will terminate. :(");
        }
        catch(IOException ie) {
            System.out.println("Input Output Error occured.");
            System.out.println(ie.getMessage());
            System.out.println("Program will terminate. :(");
        }
    }
    
    /**
     * Method writeRecord
     *
     * @param name Name of Student
     * @param s1 Physics Marks
     * @param s2 Chemistry Marks
     * @param s3 Biology Marks
     */
    static void writeRecord(String name, int s1, int s2, int s3) throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream("performance.txt",true);
        String line = name + "\t" + Integer.toString(s1) + "\t" + Integer.toString(s2) + "\t" + Integer.toString(s3);
        // converts the String into an byte array
        byte b[] = line.getBytes();
        // writes the byte array to the file and a new line after that
        fout.write(b);
        fout.write((int)('\n'));
        fout.close();
    }
    
    /**
     * Method readRecords
     *
     * @return Records of the students containing name, marks, total, percentage, grade
     */
    static String[] readRecords() throws FileNotFoundException, IOException {
        FileInputStream fin = new FileInputStream("performance.txt");
        String fileContents = "";
        int c;
        while((c = fin.read()) != -1) {
            fileContents+= (char)c;
        }
        String lines[] = fileContents.split("\n");
        String records[] = new String[lines.length];
        for(int i = 0; i < lines.length; i++) {
            String data[] = lines[i].split("\t");
            // data available from file is type-casted
            String name = data[0];
            int s1 = Integer.parseInt(data[1]);
            int s2 = Integer.parseInt(data[2]);
            int s3 = Integer.parseInt(data[3]);
            int total = s1 + s2 + s3;
            double percent = (double)(total) / 3;
            /* Assigning grade */
            char grade = '\0';
            if (percent >= 80) grade = 'A';
            else if(percent < 80 && percent > 60) grade = 'B';
            else grade = 'C';
            records[i] = name + "\t" + Integer.toString(s1) + "\t" + Integer.toString(s2) + "\t" + Integer.toString(s3) + "\t" + Integer.toString(total) + "\t" + Integer.toString((int)percent) + "\t" + grade;
        }
        return records;
    }
}

       