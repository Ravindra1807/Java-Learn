
interface Greeting {
    void sayhello(String name);

}

public class fuctionalInterface {
    public static void main(String arg[])
    {

       Greeting g = (name) -> {
        System.out.println("Hello "+ name);
       };
       
       g.sayhello("Ravindra");

    }
}