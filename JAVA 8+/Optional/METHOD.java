
import java.util.NoSuchElementException;
import java.util.Optional;
// Method orElse orElseGet

public class METHOD {

    public static void main(String[] args) {
        Optional<String> name = getName(2);
        // long    
        // String nameTobeUsed  = name.isPresent() ? name.get() : "NA";

        String nameTobeUsed = name.orElse("NA");
        String nameTboeUseds = name.orElseGet(() -> "NA");

        // Throw Exception lagnae ke liye
        // String nameTobe_Used = name.orElseThrow(() -> new NoSuchElementException());
        // METHOD Refrence USE KARNA
        String nameToube = name.orElseThrow(NoSuchElementException::new);

        System.out.println(nameTboeUseds);

    }

    private static Optional<String> getName(int id) {

        return Optional.empty();
    }
}
