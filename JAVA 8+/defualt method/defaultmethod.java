interface A{
    default void SayHello(){
       System.out.println("Hello perents");
    }
}
class  B implements A {
      public void SayHello(){
        System.out.println("Hello Child");
        A.super.SayHello();
      }
}
public class defaultmethod {
       public static void main(String[] args) {
      B a = new B();
      a.SayHello();
        

       }
}