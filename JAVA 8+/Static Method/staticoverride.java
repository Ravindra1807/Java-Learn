
interface A {

     static void S() {
        System.out.println("This is A Class");
    }
    default void Dis(){
        System.out.println("-------");
    }
}

class B implements A {
    
     @Override
    public void Dis() {
       
        A.super.Dis();
    }
    static void S(){  // OVERRIDE NHI HUAA
        System.out.println("Static .. ");
    }
}

public class staticoverride implements A {

    public static void main(String[] args) {
       B b = new B();
       b.Dis();
           
    }
}
