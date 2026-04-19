/* Without Generics :- 
       1. Type Not Safety 
       2. Manual Casting 
       3. No Compile Time Checking */

import java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) 
    {
        
        ArrayList list = new ArrayList();
    /*  1. Type is Not Safe 
        2. Manual Casting  */

// This data insert Any Type
 list

     .add("Hello World");
        list.add(123);
        list.add(3.14);
       
        // integer Can'not be cast to String
        String str = (String) list.get(0);
    String integer = (String) list.get(1);

}
}
