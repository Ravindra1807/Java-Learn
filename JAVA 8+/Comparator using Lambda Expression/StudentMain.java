
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 
public class StudentMain {
    public static void main(String[] args) {
        StudentExamp s1 = new StudentExamp(2, "Vipul");
        StudentExamp s2 = new StudentExamp(1, "Raju");
        StudentExamp s3 = new StudentExamp(3, "Knishk");
         
        List<StudentExamp> li = new ArrayList<StudentExamp>();
        li.add(s1);
        li.add(s2);
        li.add(s3);
          // Id KO desc ORDER ME SET KARNA
        Collections.sort(li ,(a,b) -> b.id - a.id);
        System.out.println(li);
    }
}