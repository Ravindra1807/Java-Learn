import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class duration {
    public static void main(String[] args) {
        Instant start = Instant.now();
        Instant end = Instant.now();
        Duration D1 = Duration.between(start, end);
        Duration D2 = Duration.of(1,ChronoUnit.MILLIS);

        System.out.println(start);
        System.out.println(end);
        System.out.println(" Duration this time : " + D1);
        System.out.println(D2);
    }
}