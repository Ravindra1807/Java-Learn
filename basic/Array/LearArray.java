
import java.util.Arrays;

public class LearArray {

    public static void main(String[] args) {
        int Number[] = {1, 2, 3, 4, 5, 6, 7, 8};

        /* 
        Arrays keyword Array Ko sort karta he 
        Arrays.sort(Number);
        */

        /* 
        Parrller Sort karna ho to  
        ek Array me ek jesi value sab me store katni ho to  
        */
        Arrays.fill(Number,14);

        for (int elem : Number) {
            System.out.print(elem + " ");
        }
        System.out.println("\n");
        

        /*  
        binarySearch Me array Phale se Sort hona chaiye tabhi chalega 
        binarySearch me ELEMENT ko Search karta he  
        */
        int Index = Arrays.binarySearch(Number, 1);

        System.out.println("The Indexing ELEMENT is 1 : " + Index);
    }
}
