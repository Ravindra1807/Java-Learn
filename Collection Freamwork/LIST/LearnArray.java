 
import java.util.ArrayList;
import java.util.Iterator;
 

public class LearnArray {

    public static void main(String[] args) {
        ArrayList<String> StudentName = new ArrayList<>();
        

        // ADD ELEMENT
        StudentName.add("Ravindra Kumar");
        // ADD ELEMENT
        StudentName.add("Sharwan");

        //  new ArrayList()
        ArrayList<String> NewList = new ArrayList<>();
        // ADD ELEMENT
        NewList.add("Jitesh");
        // ADD ELEMENT
        NewList.add("Modiram");

        // ADDALL NEW list
        StudentName.addAll(NewList);
        System.out.println(NewList);
        
         
        // ADD SPECIFIC INDEX
        StudentName.add(1, "Ravindra Suthar");
        // FOR REMOVE INDEX ELEMENT
        StudentName.remove(0);
        // FOR REMOVE ELEMENT THIS NAME
        StudentName.remove(String.valueOf("Jitesh"));
        // FOR SPECIFIC POSITION ELEMENT UPDATE
        StudentName.set(0, "Naruto");
        // ELEMENT FIND WITH OPRATIONS ...  LIST.SIZE -> CURUNT ME ELEMENT KITNE HE 
        for (int i = 0; i < StudentName.size(); i++) {
            System.out.println(" for loop Index : " + i + " " + StudentName.get(i));
        }
         // ELEMENT FIND WITH OPRATIONS .. forEach 
        for (String st : StudentName)
             {
                System.out.println("forEach loop Index : " + st );
        }

        // ELEMENT FIND WITH OPRATIONS ...  INTERATOR
        Iterator<String> it = StudentName.iterator();
        while (it.hasNext()) {
           System.out.println("Eterator : " + it.next());  
        }
        // FIND A ELEMENT SPECIFIC ELEMENT
        System.out.println(StudentName.contains("SHARLINE"));
        // ACCESS ELEMENT
        System.out.println(StudentName);

        // ALL CREAR DELETED ELEMENT LIST
        StudentName.clear();
        // ACCESS ELEMENT
        System.out.println(StudentName);
        
    }

}
