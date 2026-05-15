
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

 
public class instant11 {
    public static void main(String[] args) {
        // 1970 ke baad ka Count MillisSecond
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        // ye usi thrha nenoSecond
        Instant now = Instant.now();
        System.out.println(now);    
        // add Zone 
        ZonedDateTime zoned = now.atZone(ZoneId.of("America/New_York")); 
        System.out.println(zoned);
}
}