package LIST;

import java.util.Stack;

public class ARRAYLISTSTACK {

    public static void main(String[] args) {
        Stack<String> Animals = new Stack<>();
        // push Keyword for add a Element
        Animals.push("Loin");
        Animals.push("DOG");
        Animals.push("HOURSE");
        Animals.push("CAT");
        System.out.println("Stack : " + Animals);
        //peek Keyword is top Element found
        System.out.println(Animals.peek());
        // POP Keyword is deleted top Element
        Animals.pop();

        System.out.println(Animals);

    }
}
