// 🔹 Day 8
// ⏰ 2 घंटे (Session-1)
// Inner Class introduction
// Need of Inner Class
// Outer class vs Inner class
// Relationship between outer & inner
// Object creation concept
 
class outer{  // Outer Class
    int Marks;

    public outer(int Marks) {
        this.Marks = Marks;
    }

    
    class Inner{    // MEMEBER Inner class
        
        void Info(){  
            System.out.println("Marks : " + Marks);
            OuterIn();

            class B{    // Local Inner Class
                String name;

                public B(String name) {
                    this.name = name;
                }

                void T(){
                    System.out.println(name);
                }
            }
            B b1 = new B("null");
            b1.T();
        }
    }
    private void OuterIn(){
      System.out.println("Outer.Marks  : " + Marks);
    }

}
public class i9 {
    public static void main(String[] args) {
          outer o = new outer(78);
          outer.Inner i = o.new Inner();
          i.Info();
        
        
     }
    
}
