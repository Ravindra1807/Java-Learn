
import java.util.function.Function;
import java.util.function.UnaryOperator;

 
public class UnaryOprator {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = x -> x*x;
        Function<String, String> function2 = str -> str.toUpperCase();
        System.out.println(function2.apply("Ravi"));
         // is UnaryOperator me perameter same return type same hota he 
        UnaryOperator<Integer> unaryOperator = x -> x*5;

        System.out.println(unaryOperator.apply(32));

        // vese hi string me
        UnaryOperator<String> unaryOperator2 = str -> str.repeat(3);
        System.out.println(unaryOperator2.apply("Rajendra "));

        UnaryOperator<String> STD = str -> str.toUpperCase();
         STD.apply("Suresh");

          
        System.out.println(STD.apply("Rajesh")); 
    }
}