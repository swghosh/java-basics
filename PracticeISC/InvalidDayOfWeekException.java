public class InvalidDayOfWeekException extends Exception {
    String dayOfWeek;
    
    InvalidDayOfWeekException(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    
    public String getMessage() {
        return "Invalid day of week. " + this.dayOfWeek;
    }
}