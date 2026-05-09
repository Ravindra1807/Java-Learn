
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Bipredicate {

    public static void main(String[] args) {
        Predicate<Integer> ChekEven = x -> x % 2 == 0;
        // predicate that's Two arguments this -> Bipredicate
        BiPredicate<Integer, Integer> bipredicate = (x, y) -> x % 2 == 0 && x % 2 == 0;

        System.out.println(bipredicate.test(15, 32));

    }
}
