
class College {

    String CollegeName;
    private int Marks;

    public College(String CollegeName, int Marks) {
        this.CollegeName = CollegeName;
        this.Marks = Marks;
    }

    class Teacher {

        String Tname;
        String TSub;

        public Teacher(String Tname, String TSub) {
            this.Tname = Tname;
            this.TSub = TSub;
        }

        public Teacher() {
        }

        class Student {

            String name;
            private String Course;
            private String Result;

            public Student(String name, String Course, String Result) {
                this.name = name;
                this.Course = Course;
                this.Result = Result;
            }

            public Student() {
            }

            void StudentInfo() {
                System.out.println("\nStudent Info ");
                System.out.println("Name" + name);
                System.out.println("Marks : " + Marks);
                System.out.println("Result : " + Result);
                System.out.println("Course : " + Course);
            }

            void ALL() {
                CollegeInfo();

                TeacherInfo();

                StudentInfo();

            }
        }

        void TeacherInfo() {
            System.out.println("\nTeacher Info ");
            System.out.println("Teacher Name : " + Tname);
            System.out.println("Teacher Sub.: " + TSub);
        }

    }

    void CollegeInfo() {
        System.out.println("\nCollege Info");
        System.out.println("College Name : " + CollegeName);
    }

}

public class i5 {

    public static void main(String[] args) {
        College c1 = new College("SPU College", 5220);

        College.Teacher t1 = c1.new Teacher("Rishi Mathur", "Computer Graphics");

        College.Teacher.Student S1 = t1.new Student("Ravindra Kumar", "BCA", "Pass");

        S1.ALL();
    }
}
