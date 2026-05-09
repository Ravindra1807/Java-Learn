import java.util.Set;
import java.util.TreeSet;

public class setdemo {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(12);
        s.add(43);
        s.add(15);
        s.add(53);

        System.out.println("Before Manual Sorting : " + s);
        Set<Integer> ss = new TreeSet<>((a,b) -> b-a);
        ss.add(12);
        ss.add(15);
        ss.add(53);
        ss.add(43);

        System.out.println(ss);
    }
}