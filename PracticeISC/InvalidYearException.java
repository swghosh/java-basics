public class InvalidYearException extends Exception {
    int year;
    
    InvalidYearException(int year) {
        this.year = year;
    }
    
    public String getMessage() {
        return "Invalid year. Year must be less and 3000 and non-negative. " + this.year;
    }
}
