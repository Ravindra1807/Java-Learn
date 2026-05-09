
import java.util.function.Predicate;

// predicate - Boolean Valued Function = True False
public class predicateint {
    public static void main(String[] args) {
        // Lambda Exoression 
        Predicate<Integer> predicate = (x) -> x > 100000;
        // test method true false me answer deta he 
        System.out.println(predicate.test(20000));

    }
}