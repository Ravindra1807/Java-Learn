
import java.util.Map;
import java.util.TreeMap;

public class Maplambda {

    public static void main(String[] args) {
        Map<Integer, String> m = new TreeMap<>();
        m.put(1, "One");
        m.put(2, "Two");
        m.put(3, "Three");

        System.out.println("Before Manual Sorting :  " + m);

        Map<Integer, String> mm = new TreeMap<>((a, b) -> b - a);
        mm.put(1, "One");
        mm.put(2, "Two");
        mm.put(3, "Three");

        System.out.println("After manual sorting desc: " + mm);
    }
}
