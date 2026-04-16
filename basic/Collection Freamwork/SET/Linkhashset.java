 

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkhashset {
    public static void main(String[] args) {
          HashSet<Integer> Number = new LinkedHashSet<>();
          //LINKEDHASHSET ME ORDER FIX RAHATA HE BAS
            //DUBLICATE VALUE NHI AATI
           Number.add(234);
           Number.add(42);
           Number.add(234);
           Number.add(123);
           System.out.println(Number);
           Number.remove(123);
         System.out.println(Number);
         System.out.println(Number.contains(42) + " " + Number.isEmpty() + " " + Number.size());
         

    }
  
}
