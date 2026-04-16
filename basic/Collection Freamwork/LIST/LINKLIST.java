package LIST;

 
import java.util.LinkedList;
 
 

public class LINKLIST {
    public static void main(String[] args) {
       LinkedList<String> Name = new LinkedList<>();
       Name.add("Ravindra");
       Name.add("Sharwan");
        Name.add("Kumar");
        LinkedList<String> Fname = (Name);
        Fname.add("e");
        Name.removeAll(Fname);
       System.out.println(Fname);

    }
}
