
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listdemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(54);
        list.add(43);
        list.add(12);

        Collections.sort(list);
        System.out.println("Assending Order : " + list);
        // Lambda Expression SE HAM Collections Sort ke doran implement kar sakte he 
        Collections.sort(list, (a, b) -> b - a);

        System.out.println("Dedending Order : " + list);

    }
}
