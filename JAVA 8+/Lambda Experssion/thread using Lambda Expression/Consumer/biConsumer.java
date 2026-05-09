
import java.util.function.BiConsumer;
import java.util.function.Consumer;

 
public class biConsumer {
    public static void main(String[] args) {
        Consumer<Integer> sConsumer = (x) -> {
      System.out.println(x);
        };

        BiConsumer<Integer,Integer> biCons = (num1 , num2) -> {
        System.out.println(num1 + num2);
        };

        biCons.accept(21, 32);
        
    }
}