// Abstract Class + Interface ✔ Abstract class constructor ✔ Abstract + normal methods ✔ Interface implementation ✔ Multiple inheritance using interface
 abstract class College{
int roll;

    public College(int roll) {
        this.roll = roll;
    }
    void INFO(){
        System.out.println("roll : " + roll);
    }
   abstract void Details();
 }
 class student extends College{
String name;

    public student(String name,int roll) 
    {
          super(roll);
        this.name = name;
    
    }

    @Override
    void Details() {
         System.out.println("Name : " + name);
        super.INFO();
    }
    
    
 }

public class day_2_3 {
    public static void main(String[] args) {
      College s1 = new student("RAVINDRA KUMAR", 1001);
      s1.Details();
    }
    
}
