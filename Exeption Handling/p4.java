class a{ }
class b extends a{ }

public class p4 {
   public static void main(String[] args) {
       try {
           a a1 = new a();
           b b1 = (b) a1;

       } catch (ClassCastException e) {
    System.out.println("Invalid class casting ");   
    }
   }    
}
