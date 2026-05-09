 // ye Function Operation karta he 
import java.util.function.Function;

 // ye bhi ek fuctionalInterface he 
 // interface Function<T , R>
 // R apply(T t) , defult
public class fun {
    public static void main(String[] args) {
        Function<String,Integer> getlen = x -> x.length();
        Function<String,String> getthree = s -> s.substring(0,4);
        
        System.out.println(getthree.apply("Ravindra"));
        System.out.println(getlen.apply("Boss"));
    }
    
}