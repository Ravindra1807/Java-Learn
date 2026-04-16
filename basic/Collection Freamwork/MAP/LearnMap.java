
import java.util.HashMap;
import java.util.Map;

public class LearnMap {

    public static void main(String[] args) {
         // Map create {TO DATA TYPES} KEY+VALUE KE
        Map<String, Integer> Number = new HashMap<>();
       // ADD->PUT KEYWORD { KEY , VALUE } 
        Number.put("One", 01);
        Number.put("Two", 02);
        Number.put("Three", 03);
        Number.put("Two", 54);
        System.out.println(Number);
        
        // SAME ELEMENT ADD KARNE PAR OVERRIDE SE PACHNE KE LIYE 
        // 1.
        if(!Number.containsKey("Two")) {
            Number.put("Two", 34);
        }
        // 2. putIfAbsent me key or element daale to OVERRIDE nhi hoga
                   Number.putIfAbsent("Two", 43);
        //  3. put se add kiya to OVERRIDE hoga
               Number.put("Two", 433);
        
        // Map for loop se retrive karna {en key+element}, {getkey key} , {getvalue value}
        for (Map.Entry<String, Integer> en : Number.entrySet()) {
            System.out.println( en + " "+ en.getKey() + " " + en.getValue());
        }
        
        // ALL KEY'S RETRIVE
        for(String key : Number.keySet()){
            System.out.println(key);
        }

        //  ALL VALUE'S RETRIVE
        for(Integer value : Number.values()){
            System.out.println(value);
        }
        System.out.println(Number.containsKey("Two") + " "+ Number.containsValue(433));

        // System.out.println(Number);
    }

}
