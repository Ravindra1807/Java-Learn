
interface MyClass {

    static void Display() {
        System.out.println("This is Static Method Call... ");
    }

    default void Say() {
        System.out.println("Hello World");
    }
}

public class staticdemo implements MyClass {

    public static void main(String[] args) {
        //    staticdemo d = new MyClass();   Override Nhi kar sakte
        //     d.Display();
        //     staticdemo.Display();
        MyClass.Display();

            staticdemo d = new staticdemo(); 
            d.Say();
     }
}
