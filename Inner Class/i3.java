
class School {

    static String name = "Ravindra Kumar";
    static int roll = 1001;

    void outerClass() {
        System.out.println("Name : " + name + "Roll No. : " + roll);

    }

    static class Student {

        void Show() {
            System.out.println("Name : " + name + " Roll No. : " + roll);
        }
    }

}

public class i3 {

    public static void main(String[] args) {

        School.Student std = new School.Student();

        std.Show();

    }
}
