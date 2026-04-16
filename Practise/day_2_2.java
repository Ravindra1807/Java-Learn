// Abstract Class + Interface ✔ Abstract class constructor ✔ Abstract + normal methods ✔ Interface implementation ✔ Multiple inheritance using interface
 
abstract class A{
   abstract void A();
   
   void add(){
    System.out.println("HELLO World");
   }
}
class B extends  A{
   void A(){
     System.out.println( "Hello World");
   }  
}
class C extends A{
    void A(){
        System.out.println("C c c ");
    }
}
class day_2_2{
    public static void main(String[] args) {
        // A a1 = new B() ;
        // a1.A();
        // a1.add();
        // a1.A();
        C a2 = new C();
        a2.A();
        a2.add();
    }

}