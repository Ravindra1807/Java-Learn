 
import java.util.Map;
import java.util.TreeMap;
 

 

public class treeMap {
    public static void main(String[] args) {
        Map<String ,Integer> std = new TreeMap<>();
        // TreeMap key ke base pe shoting karta he 
        std.put("B", 001);
      std.put("Z", 002); 
        std.put("C", 005);
      std.put("D", 003);
        std.put("A", 004);

     System.out.println(std);
        std.remove("C");
        System.out.println(std);
    }
}