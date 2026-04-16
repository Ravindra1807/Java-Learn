public class day_1 {
    String name;
    int roll;

    void dis(){
        System.out.println( "Name : " + name);
        System.out.println("Roll No : " + roll);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        day_1 d = new day_1();

        d.roll = 1001;
        d.name = "Ravindra Kumar";

        day_1 d1 = new day_1();

        d1.roll = 1002;
        d1.name = "Ranjeet";

        d.dis();
        d1.dis();
    }
}
