
import java.time.LocalDate;
import java.time.Period;

 
public class periodtime {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(1900, 2, 12);
        Period period = Period.between(now, then);
        System.out.println(period);
    }
}