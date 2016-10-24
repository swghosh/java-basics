import java.io.*;

class Employees {
    
    static void printRecords() {
    }
    
    static void writeRecord(String empName, int empCode, double salary) throws FileNotFoundException, IOException {
        FileWriter fw = new FileWriter("employees.csv", true);
        PrintWriter fpr = new PrintWriter(fw);
        fpr.println("\"" + empName + "\"," + String.valueOf(empCode) + "," + String.valueOf(salary) + "\r\n");
        fpr.close();
        fw.close();
    }
}