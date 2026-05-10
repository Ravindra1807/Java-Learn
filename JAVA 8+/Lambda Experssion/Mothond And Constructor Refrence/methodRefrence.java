import java.util.Arrays;
import java.util.List;

public class methodRefrence {
   public static void print(String s){
    System.out.println(s);
   }
   public static void main(String[] args) {
    List<String> Students = Arrays.asList("Alice","Bjd","Charlie");
    //  Students.forEach(x->System.out.println(x));
     // Lambda expression can be replaced by method refrence 
     Students.forEach(methodRefrence::print);
    // :: Method refrence Oprator [Method refrence deene ke liye use me liya jaata he]
    // agar method static nhi ho to object creat karke bhi kar sakte he 
   }
}