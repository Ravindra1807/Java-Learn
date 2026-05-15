 
import java.time.LocalTime;

public class localtime {

    public static void main(String[] args) {
        // Cuurent time
        LocalTime now = LocalTime.now();
        // custom time
        LocalTime custom = LocalTime.of(12, 42, 54);
        // parse opration time
        LocalTime timeInString = LocalTime.parse("12:32:22");
        //  parse -> past time
        LocalTime past = now.minusHours(1);
        // condition's
        if(now.isAfter(past)){
            System.out.println("Yes");
        }
        System.out.println(custom);
        System.out.println(now);
        System.out.println(past);
    }
}
