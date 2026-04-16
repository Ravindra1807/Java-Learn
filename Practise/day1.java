public class day1 {
    String name;
    int roll;

     day1(String name, int roll) 
     {
        this.name = name;
        this.roll = roll;
    }
     day1()
     {
        System.out.println("Defult Constructoring .... ");
     }
    
    void dis(){
        System.out.println( "Name : " + name);
        System.out.println("Roll No : " + roll);
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        day1 a = new day1();
        day1 a1 = new day1("Ravindra", 1001);
       
        a.name = "Ranjeet";
        a.roll = 1003;

        a.dis();
        a1.dis();


    }
    
    
}
