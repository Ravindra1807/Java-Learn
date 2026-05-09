
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctio {

    public static void main(String[] args) {

        Function<String, Integer> fun = str -> str.length();

        // function me perameter -> 2
        BiFunction<String, String, Integer> biFunction = (x, y) -> x.length() + y.length();

        System.out.println(biFunction.apply("Raja", "Ram"));
    }
}
