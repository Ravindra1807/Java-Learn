
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

 
public class formatte {
    public static void main(String[] args) {
        // khud ke formatte me datetime kese DE -- MM samll m minute 
       String date = "18/07/2022";
       DateTimeFormatter myforFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       // date and formatte add
       LocalDate parse = LocalDate.parse(date, myforFormatter);
       System.out.println(parse);

        String datetime = "18/07/2022 10:21:32+05:30";
       DateTimeFormatter myforFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ssXXX");
       // date and formatte add
       ZonedDateTime zonedDateTime = ZonedDateTime.parse(datetime, myforFormatter1);
       System.out.println(zonedDateTime);
    }
}