  // ye bhi ek functionInterface he jish me ek method he 
 // T get()   return karta he Consume nhi karta

import java.util.function.Supplier;

public class sup {
    public static void main(String[] args) {
        Supplier<Integer> sup = () ->  1;
       System.out.println(sup.get());
    }
}