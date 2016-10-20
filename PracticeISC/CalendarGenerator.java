import java.util.Scanner;

class CalendarGenerator {
    static void generate(int year, String month, String dayOfWeekInit) throws InvalidYearException, InvalidMonthException, InvalidDayOfWeekException {
        
        // month names and its respective number of days
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] daysOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        // initialise required indices
        int monthIndex = 0;
        int dayOfWeekInitIndex = 0;
        int daysInMonth = 0;
        
        // year validation
        if(year > 3000 || year < 0) {
            throw new InvalidYearException(year);
        }
        
        // upon leap year make February 29 days
        if(year % 4 == 0 && year % 400 != 0) {
            daysOfMonths[1] = 29;
        }
        
        // month validation
        boolean isValidMonth = false;
        for(int i = 0; i < months.length; i++) {
            if(months[i].equalsIgnoreCase(month)) {
                isValidMonth = true;
                month = months[i]; // makes sure that exact uppercase/lowercase of month name is used
                monthIndex = i;
                daysInMonth = daysOfMonths[i];
                break;
            }
        }
        
        if(isValidMonth == false) {
            throw new InvalidMonthException(month);
        }
        
        // day of week name init name validation
        boolean isValidDayOfWeek = false;
        for(int i = 0; i < daysOfWeek.length; i++) {
            if(daysOfWeek[i].equalsIgnoreCase(dayOfWeekInit)) {
                isValidDayOfWeek = true;
                dayOfWeekInit = daysOfWeek[i];
                dayOfWeekInitIndex = i;
                break;
            }
        }
        
        if(isValidDayOfWeek == false) {
            throw new InvalidDayOfWeekException(dayOfWeekInit);
        }
        
        // print the heading with month and year
        System.out.println("\t\t" + month + " " + year);
        for(int i = 0; i < daysOfWeek.length; i++) {
            System.out.print(daysOfWeek[i].substring(0,3).toUpperCase() + "\t");
        }
        System.out.println();
        
        // print the blank columns init
        for(int i = 0; i < dayOfWeekInitIndex; i++) {
            System.out.print("\t");
        }
        
        // counter from 1 to days in month
        int counter = 0;
        for(int i = dayOfWeekInitIndex; i < 7; i++) {
            System.out.print(++counter + "\t");
        }
        System.out.println();
        
        // print the remaining columns
        boolean printFlag = true;
        for(int i = 0; printFlag ; i++) {
            for(int j = 0; j < 7; j++) {
                if(counter >= daysInMonth) {
                    printFlag = false;
                    break;
                }
                System.out.print(++counter + "\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            // user inputs year, month, first day of week
            System.out.print("Year -> ");
            int year = sc.nextInt();
            System.out.print("Month -> ");
            String month = sc.next();
            System.out.print("First day of week -> ");
            String dayOfWeek = sc.next();
            // generate calendar
            generate(year, month, dayOfWeek);
        }
        // messages to be displayed during invalid input
        catch(InvalidYearException y) {
            System.out.println("Invalid Year was entered.");
        }
        catch(InvalidMonthException m) {
            System.out.println("Invalid Month name was entered.");
        }
        catch(InvalidDayOfWeekException d) {
            System.out.println("Invalid Day of Week name was entered.");
        }
    }
}