import java.util.Scanner;
public class DayEstimator {
    /** getDay() returns date, month, year when number of days passed in a year is given*/
    public static String getDay(int day, int year) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(isLeapYear(year)) {
            monthDays[1]++;
        }
        int daySum = 0;
        int m = 0;
        for(; m < 12 && daySum <= day; m++) {
            daySum = daySum + monthDays[m];
        }
        daySum = daySum - monthDays[--m];
        int d = day - daySum;
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String date = d + " " + monthName[m] + " " + year;
        return date;
    }
    /** isLeapYear() returns whether a year is leap or not*/
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0);
    }
    /** getFutureDay() returns date, month, year when number of days passed in a year is given and date is advanced by few days (Assumption : 1 <= n <= 100 */
    public static String getFutureDay(int day, int year, int n) {
        int yearDays = ((isLeapYear(year) ? 366 : 365));
        if(day + n > yearDays) {
            year = year + (day + n) / yearDays;
            return getDay((day + n) % yearDays, year);  
        }
        else return getDay(day + n, year);
    }
    /** main() method to be executed at runtime*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("DAY NUMBER ->");
        int day = sc.nextInt();
        System.out.print("YEAR ->");
        int year = sc.nextInt();
        System.out.print("N (DAYS ADVANCE) ->");
        int n = sc.nextInt();
        System.out.println(">" + getDay(day, year));
        System.out.println(">" + getFutureDay(day, year, n));
    }
}
