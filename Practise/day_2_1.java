//polymorphism Compile time  ( OVERLODING ), Runtime time ( vOERRIDING ),Runtime Binding (Dynamic Method Dispatch),✔ Parent reference – child object
class A{
  void Add(){
     System.out.println("A");
  }
}
class B extends A{
  void Add(){
     System.out.println("B");
  }
}
class ADD extends B{
   void Add(){
     System.out.println("C ");
   }
   void Add(int a,int b){
     System.out.println("Duo : " + (a+b));
   }
   void Add(int a,int b,int c)
   {
   
    System.out.println("Three : " + (a+b+c));
   }

}
class day_2_1{
    public static void main(String[] args) {
        ADD a = new ADD();
        a.Add();
        A a1 = new A();
        a1.Add();
        B b1 = new B();
        b1.Add();

      
        A r = new ADD();
        r.Add();
        A e = new B();
        e.Add();
        A aB = new B();
        aB.Add();
        
  
    }
}