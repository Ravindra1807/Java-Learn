
interface perents {

    default void Hello() {
        System.out.println("perents");
    }
;

}

interface Child {

    default void Hello() {
        System.out.println("Child");
    }
;

}

public class impl implements perents, Child {

    public static void main(String[] args) {
      impl a = new impl();
      a.Hello();
    }

    public void Hello() {
        System.out.println("This is Main Class ");
        perents.super.Hello();
        Child.super.Hello();
    }
}
