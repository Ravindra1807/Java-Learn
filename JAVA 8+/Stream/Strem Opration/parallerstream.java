
import java.util.Arrays;
import java.util.List;

    // min max count collect --> terminal opration --> last me aate he  
public class parallerstream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        // parellelStream ek strem Same hota he 
        // diffrence bas parellelStream  fast kam ke liye 
        // chote chote chungs me divide karta he 
        // chote kam ke liye parallelStream use hota he 
        list.parallelStream();
        System.out.println(list);
    }
}