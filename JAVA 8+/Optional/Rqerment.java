 // Optional ek Box ki thrha he  
 // Optional me value's .ofNullable ka matlab
 //  ki value Null hosakti he
 // .isPresent Return bollean , 
 // .ifPresent Consumer return karta he
import java.util.Optional;
 
public class Rqerment {
    public static void main(String[] args) {
        // String name = getName(1);
        // null Pointer Exception  
        // if(name != null){
        //         System.out.p rintln(name.toUpperCase());
        // }

        // Null ho sakta he to.. 
        Optional<String> name = getName(2);
        // isPresent bollean he .. Methd 1..
        if(name.isPresent()){
            System.out.println(name.get());
        }
        // Method 2..  Lambda Expression
        name.ifPresent(x -> System.out.println(x));
        // Method 3.. method Refrence use
        name.ifPresent(System.out::println);

       
        name.get();

    

    }

    private  static Optional<String> getName(int id){
        String name = "Ravi";
        // return Optional.empty(); // Null return 
        return Optional.ofNullable(name); // agar Null ho sakta he
        // return Optional.of(name); // value return karta he  Null me Error 
    }
}