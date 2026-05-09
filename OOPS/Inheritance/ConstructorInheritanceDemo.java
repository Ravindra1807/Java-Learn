 class A{

     A() {
        System.out.println("hello");
    }
    
 }
 class B extends A{

    B() {
        System.out.println("Bol");
    }
    
 }
 class ConstructorInheritanceDemo{
    public static void main(String[] args) {
        A a = new B();
    }
 }