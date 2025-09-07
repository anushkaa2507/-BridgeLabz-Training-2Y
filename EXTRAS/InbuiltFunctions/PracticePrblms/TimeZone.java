import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); 
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); 

        System.out.println("GMT : " + gmt.format(fmt));
        System.out.println("IST : " + ist.format(fmt));
        System.out.println("PST : " + pst.format(fmt));
    }
}
