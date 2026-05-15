
import java.time.ZoneId;
import java.time.ZonedDateTime;

// UTC -> 24-ZonedDateTime 
// localdateTime NHI AATA IS ME
 

public class ZonedDT {
    public static void main(String[] args) {
       // Cu urent datetime
        ZonedDateTime utcTIME =  ZonedDateTime.now();
         System.out.println(utcTIME);
         // Custom ZonedDateTime
         ZonedDateTime AfricacustomTime = ZonedDateTime.of(2012,03,14,12,32,43,54,ZoneId.of("Africa/Cairo"));
        // Zone time's
         Set<String> availableZonedID = ZoneId.getAvailableZoneIds();
         System.out.println(availableZonedID.size());
         availableZonedID.forEach(System.out::println);
         System.out.println(AfricacustomTime);

         //Asia/Kolkata time
         ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
         System.out.println("Current time in India : " + indiaTime);
         ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
         System.out.println("Current time in New-York : " + newYorkTime);

         
    }
}