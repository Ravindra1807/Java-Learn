
import java.util.ArrayList;
import java.util.Collections;
 import java.util.List;

public class LearnCallectionClass {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("RAM", 5));
        list.add(new Student("Anuj", 0));
        list.add(new Student("Sharwan", 1));
        list.add(new Student("zavindra", 2));

        Student a = new Student("Anuj", 0);
        Student a1 = new Student("RAM", 3); 

        System.out.println(list);

    //   name me shrt karna ke liye 2 methode he 
    //    Collections.sort(list,(o1,o2)->o1.name.compareTo(o2.name));
       
    //    Collections.sort(list,new Comparator<Student>(){
    //           public int compare(Student o1,Student o2){
    //             return o1.name.compareTo(o2.name);
    //           }
    //    });

        // System.out.println(a.compareTo(a1));
        Collections.sort(list);
        System.out.println(list);

        //       List<Integer> Name = new ArrayList<>();
        // Name.add(12);
        // Name.add(23);
        // Name.add(243);
        // Name.add(43);
        // Name.add(65);
        // Name.add(11);
        // Name.add(12);
        // Name.add(654);
        // System.out.println("Collection Opration ");
        // System.out.println("Minimum Value : " + Collections.min(Name) );
        // System.out.println("Maximum Value  : " + Collections.max(Name));
        // System.out.println("Repeted Value[frequency] : " + Collections.frequency(Name, 12));
        // Collections.sort(Name);
        // Collections.sort(Name, Comparator.reverseOrder() );
        // System.out.println(Name);        
    }

}
