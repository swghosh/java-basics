import java.util.*;
class ISCCountdown {
    public static void main(String[] args) throws Exception {
        Calendar now = new GregorianCalendar(), isc = new GregorianCalendar(2017, 2, 1, 14, 0);
        for(int i = 0; i < 10; i++) {
            now = new GregorianCalendar();
            long diff = isc.getTime().getTime() - now.getTime().getTime();
            
            long sDiff = diff / 1000;
            
            long days = sDiff / 86400;
            sDiff = sDiff - (days * 86400);
            
            long hours = sDiff / 3600;
            sDiff = sDiff - (hours * 3600);
            
            long minutes = sDiff / 60;
            sDiff = sDiff - (minutes * 60);
            
            long seconds = sDiff;
            
            System.out.println(days + "days "  + hours + "hours " + minutes + "minutes " + seconds + "seconds");
            Thread.sleep(1000);
        }
    }
}