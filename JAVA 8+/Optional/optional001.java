import java.util.Optional; 
public class optional001 {
    public static void main(String[] args) {
        Optional<String> optional = getName(2);
        Optional<String> optional1 = optional.map(x -> x.toUpperCase());
        System.out.println(optional);
        System.out.println(optional1);
        optional1.ifPresent(System.out::println);

    }
    private static Optional<String> getName(int id){
        return Optional.of("value");
    }
}