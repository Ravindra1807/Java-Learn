/*Generics khata ha ki kisi bhi type ke sath khel sakte he par 
Type safety Honi chaliye */
public class GenericsMEX {

    public static void main(String[] args) {
        GenericsEXOne<Integer> eg = new GenericsEXOne<>();
        /* Class is now Type safe
         ExampleGenerics class Ko Generics types banadenge
        */
         eg.setValue(1);
         
      /* Compile Time pe error aaega
        String i = (String) eg.getValue();
       */

        int i = eg.getValue();

        System.out.println(i);
        
    }
}
