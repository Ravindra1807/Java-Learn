/* Generics Version-5 add */
import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
        //fix type of Object
         
        // This data insert Any Type
        list.add("Hello World");
        list.add("Hello Boss");

        // Compile Type Error to integer Type
       
        /*list.add(123);
        list.add(3.14);  */ 
        
        // Short Form Insert
       String s = list.get(0);
       String s1 = list.get(1);

       System.out.println(s);
        
        /* String str =   (String) list.get(0);
        String integer =   (String) list.get(1);
        */ 
    }
}