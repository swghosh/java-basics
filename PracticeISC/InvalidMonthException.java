public class InvalidMonthException extends Exception {
    String month;
    
    InvalidMonthException(String month) {
        this.month = month;
    }
    
    public String getMessage() {
        return "Invalid month name. " + this.month;
    }
}