
import java.util.HashSet;

public class Learnhashset {

    public static void main(String[] args) {
        HashSet<Integer> Number = new HashSet<>();
        //LINKEDHASHSET ME ORDER FIX NHI RAHATA HE BAS
        //DUBLICATE VALUE NHI AATI   --> BigOF N^1
        Number.add(234);
        Number.add(42);
        Number.add(234);
        Number.add(123);
        System.out.println(Number);
        Number.remove(123);
        System.out.println(Number);
        System.out.println(Number.contains(42) + " " + Number.isEmpty() + " " + Number.size());

    }

}
