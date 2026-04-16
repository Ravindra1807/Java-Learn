class A{
    String name;
    private int Marks;
   
    A(String name,int Marks)
    {
        this.name = name;
        this.Marks = Marks;
    }

    class B{
        int CGPA; 
          B(String name , int Marks , int CGPA)
          {
             
          this.CGPA  = CGPA;
           }

           class C{
                class D{
                    
               }
           }

        void Info(){
           System.out.println("Name : "+ name);
        System.out.println("Marks : " + Marks);
        System.out.println("CGPA : " + CGPA);
    } 
}

    void AA(){
        
        System.out.println("Name : "+ name);
        System.out.println("Marks : " + Marks);
    }

}
public class i4 {
    public static void main(String[] args) {
       A a1 = new  A("Ravindra Kumar ",1855);

       a1.AA();

       A.B b1 = a1.new B("Rina",321,65);

        

       b1.Info();
      
    
  
    }
}
