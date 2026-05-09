
// fuctionalInterface ek compiler ko datane ke liye ki ye ek 
// sigle Abstract method he to 
// app dursra koi fuction nhi bana sakte he Error bataega 
@FunctionalInterface
interface Hello {

    // int sayhell();  Worng  
    public void meth();  // This is Abstract Method

    // default method ka use kar sakte he - THIS IS NOT Abstract METHOD
    default void def(int w, int d) {
        System.out.println("This is A default method : " + (w + d));
    };
     
    // THis is Static direct call karne ke liye  or ye Abstract method nhi he 
    public static void sta() {
        System.out.println("hello static method");
    };

}

public class functionalterfaceLambda {

    public static void main(String[] args) {
        Hello s = () -> System.out.println("Hello World ");
        s.meth();
        s.def(12, 32);
        Hello.sta();
    }
}
