import java.io.*;
import java.util.*;

class PersonalDetailPrinter {

    static void writeDetails() throws IOException {
        try {
            File f = new File(System.getenv("HOME") + "/Desktop/details.txt");
            FileOutputStream fout = new FileOutputStream(f);
            boolean exit = false;
            while(!exit) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Personal Detail (terminate using @) ->");
                String data = sc.nextLine();
                for(int i = 0; i < data.length(); i++) {
                    char c = data.charAt(i);
                    if(c == '@') {
                        exit = true;
                        break;
                    }
                    fout.write((int)c);
                }
                fout.write((int)'\n');
                sc.close();
            }
            fout.close();
        }
        catch(FileNotFoundException fe) {
            System.out.println("File wasn't found on system.");
        }
    }

    static void readDetails() throws IOException {
        try {
            System.out.println("\n----DETAILS----");
            int vowelsCount = 0, lettersCount = 0, digitsCount = 0, othersCount = 0;
            File f = new File(System.getenv("HOME") + "/Desktop/details.txt");
            FileInputStream fin = new FileInputStream(f);
            int c = 0;
            while((c = fin.read()) != -1) {
                char ch = (char)c;
                System.out.print(ch);
                // vowel test
                String vowels = "AEIOU";
                if(vowels.indexOf(Character.toUpperCase(ch)) != -1) vowelsCount++;

                if(Character.isLetter(ch)) // letter test
                    lettersCount++;
                else if(Character.isDigit(ch)) // digits test
                    digitsCount++;
                else if(Character.isWhitespace(ch)); // white space
                else // special characters test
                    othersCount++;
            }
            System.out.println("Vowels count: " + vowelsCount + "\nAlphabets count: " + lettersCount + "\n Digits count: " + digitsCount + "\nSpecial characters count: " + othersCount);
        }
        catch(FileNotFoundException fe) {
            System.out.println("File wasn't found on system.");
        }
    }

    public static void main(String[] args) {
        try {
            writeDetails();
            readDetails();
        }
        catch(IOException ie) {
            System.out.println("Input/Output Error.");
        }
    }
}