package QUEUE;
import java.util.ArrayDeque;

public class LearnArraydeque {
    public static void main(String[] args) {
      ArrayDeque<String> AI = new ArrayDeque<>();
      AI.offer("Ravindra");
      AI.offer("Names");
      AI.offer("Roman");
      AI.offer("Rishi");
     AI.offerFirst("TRAK");
     AI.offerLast("End");
     System.out.println(AI);
     AI.pollFirst( );
     AI.pollLast();
     System.out.println(AI);

    }
}
