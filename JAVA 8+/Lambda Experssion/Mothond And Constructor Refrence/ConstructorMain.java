
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 
public class ConstructorMain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","America" ,"Transformer");
        List<ConstructorRefrenceE> students = names.stream().map(ConstructorRefrenceE::new).collect(Collectors.toList());
       
    }
}