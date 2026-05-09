import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
// Ye Bhi ek Single Abstract Method Hota he  -- functioninterface
public class Cons {
    public static void main(String[] args) {
        // Consumer ek database jesaa hota he jo data ko Consume karta he 
        Consumer<String> Consum = s -> System.out.println(s);
        Consum.accept("Vipul");
        Consumer<List<Integer>> listConsumer1 = li -> {
            for (Integer elem : li) {
                System.out.println(elem + 100);
            }
        };

        Consumer<List<Integer>> listConsumer2 = li -> {
            for (Integer elem : li) { 
                System.out.println(elem );
            }
        };
        Consumer<List<Integer>> listConsumer = listConsumer2.andThen(listConsumer1);
        listConsumer.accept(Arrays.asList(1,2,3,4,5,6,7,8));

    }
}