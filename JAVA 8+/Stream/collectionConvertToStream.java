
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class collectionConvertToStream {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Apple", "Banana" , "Cherry");
        // Collection Convert To Stream
       Stream<String> myStream = list.stream();

       String[] array = {"apple","banana","cherry"};
      // Array Convert To Stream
       Stream<String> stream = Arrays.stream(array);

       //Direct Stream   
       Stream<Integer> direct = Stream.of(1,2,3,4,5);

    // interate(seed(firstvalue of stream),(Unary-Lembda Expression))
    // Range yaa loop lagane ke liye interate ka use karte he 
      Stream<Integer> limit = Stream.iterate(0, x ->  x + 1).limit(100);

      // Supplier ka use se kuch generate karna ho shirf output dega
      Stream<Integer> str = Stream.generate(() -> (int) Math.random() * 100).limit(5);
    
    }
}
