package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedlistQueue {

    public static void main(String[] args) {
        Queue<String> car = new LinkedList<>();
          car.offer("car-1");
        // offer Keyword this Element add without rutime exception
        car.offer("car-2");
        // ADD Element Danger for runtime exception { No Use THIS Queue } 
        car.add("Ravindra");

        
        System.out.println(car);
        // poll Keyword this deleted Element
        car.poll();
       // REMOVE Element Danger for runtime exception { No Use THIS Queue }
       car.remove();
        System.out.println(car);
        //peek Keyword find this next Element
        System.out.println(car.peek()); 
        System.out.println(car.element());
    }
}
