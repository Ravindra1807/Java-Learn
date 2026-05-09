package QUEUE;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
          PriorityQueue<Integer> Ravi = new PriorityQueue<>(Comparator.reverseOrder());
         Ravi.add(123);
         Ravi.add(12);
         Ravi.add(13);
          Ravi.offer(34);
          Ravi.offer(16);
          System.out.println(Ravi);
          Ravi.poll();
             System.out.println(Ravi);
    }
  
}
