
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Wildcard ke use me aap add nhi kar satke
        ArrayList<?>  newl = new ArrayList<>();
        // ADD nhi hoga error
        newl.add(43);
    }

     /*  public <T> void  PrintArrayList(ArrayList<T> list){
         for (T o : list) {
             System.out.println(o);
            
    } */

     //jab ReadOnly Work ho to ham Wildcard ka use kar sakte he 
      /*  public Object GetFirst(ArrayList<?> list){
       return list.get(0);
            
        }*/

         public <T> T GetFirst(ArrayList<T> list){
       return list.get(0);
            
        }

        public <T> void copy (ArrayList<T> sourse, ArrayList<T> destination){
            for (T elem : sourse) {
                destination.add(elem);
            }
        }
    }

