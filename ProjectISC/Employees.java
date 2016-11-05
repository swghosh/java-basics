import java.io.*;
import java.util.*;

class Employees {
    
    /**
     * Method writeRecord
     *
     * @param empName Employee name
     * @param empCode Employee code
     * @param salary Employee salary
     */
    static void writeRecord(String empName, int empCode, double salary) throws FileNotFoundException, IOException {
        File f = new File("employees.csv");
        FileWriter fw = new FileWriter(f, true);
        PrintWriter fpr = new PrintWriter(fw);
        fpr.println("\"" + empName + "\"," + String.valueOf(empCode) + "," + String.valueOf(salary));
        fpr.close();
        fw.close();
    }

    /**
     * Method readRecords
     *
     * @return List of employee records in the form of an array
     */
    static String[] readRecords() throws FileNotFoundException, IOException {
        String records = "";
        File f = new File("employees.csv");
        Scanner sc = new Scanner(f);
        sc.useDelimiter("\n");
        sc.next(); // initial token headings line skip 
        while(sc.hasNext()) {
            String line = sc.next();
            String[] data = line.split(",");
            String name = data[0].substring(1, data[0].length() - 1); // removes wrapping quotes in name
            int empCode = Integer.parseInt(data[1]);
            double basic = Double.parseDouble(data[2]);
            
            double da = 0.4 * basic, hra = 0.3 * basic;
            double gross = basic + da + hra;
            double sa = 0;
            if(empCode <= 15) {
                sa = 0.2 * gross;
            }
            else {
                sa = 1000;
            }
            double total = gross + sa;

            records = records + name + "\t" + String.valueOf(empCode) + "\t" + String.valueOf(basic) + "\t" + String.valueOf(da) + "\t" + String.valueOf(hra) + "\t" + String.valueOf(gross) + "\t" + String.valueOf(sa) + "\t" + String.valueOf(total) + "\n";
        }
        
        sc.close();
        return records.trim().split("\n");
    }
    
    /**
     * Method main
     * method is executed at runtime
     * @param args command line arguments
     */
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("--MENU--\n1-Add Employees\n2-Show Employees\' Details");
            System.out.print("Choice ->");
            int ch = sc.nextInt();
            switch(ch) {
                case 1:
                boolean exit = false;
                while(!exit) {
                    System.out.print("Name of Employee ->");
                    sc.close();
                    sc = new Scanner(System.in);
                    String name = sc.nextLine();
                    // reinitialise scanner after name input
                    sc.close();
                    sc = new Scanner(System.in);
                    
                    System.out.print("Employee code ->");
                    int empCode = sc.nextInt();
                    
                    System.out.print("Basic salary ->");
                    double basic = sc.nextDouble();
                    
                    writeRecord(name, empCode, basic);
                    
                    System.out.println("Press 1 to add another, 2 otherwise.");
                    int s = sc.nextInt();
                    
                    if(s == 1) {
                        continue;
                    }
                    else if(s == 2) {
                        exit = true;
                    }
                    else {
                        System.out.println("Invalid choice.");
                        exit = true;
                    }
                }
                break;
                case 2:
                System.out.println("Name\t\tCode\tBasic\tDA\tHRA\tSalary\tSpAllo\tTotal");
                String records[] = readRecords();
                for(int i = 0; i < records.length; i++) {
                    System.out.println(records[i]);
                }
                break;
                default:
                System.out.println("Invalid choice.");
            }
        }
        catch(FileNotFoundException fnfe) {
            System.out.println("Cannot find the required file.");
            System.out.println(fnfe.getMessage());
        }
        catch(IOException ie) {
            System.out.println("Input Output error occured.");
            System.out.println(ie.getMessage());
        }
        catch(InputMismatchException ime) {
            System.out.println("Error in input.");
            System.out.println(ime.getMessage());
        }
    }
}