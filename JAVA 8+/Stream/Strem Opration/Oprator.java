
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Oprator {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 2, 4);
        // stream with filter operation filter(predicate-inter.)

        List<Integer> filterlist = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(filterlist);

        List<Integer> mapedlist = filterlist
                .stream() // stream me convert
                .map(x -> x / 2) // map(Function (Lambda Expression))
                .distinct() // dublicate value 
                .sorted((a, b) -> (b - a)) // default=Ass, Customie karke dic.
                .limit(3) // limit ..
                .skip(2) // first values skip's 
                .collect(Collectors.toList()); // list me conllecte

        System.out.println(mapedlist);

         long collect = Stream
                .iterate(0, z -> z + 1) // loop .. 
                .filter(x -> x % 2 == 0)
                .limit(101)
                .map(x -> x / 10)
                .distinct()
                .peek(System.out::print)
                .sorted((a,b) -> (b-a))
                .max((a,b) -> a-b)
                .get();


        System.out.println(collect);
    }
}
