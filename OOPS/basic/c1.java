
class Student {

    String Name;
    int Age;

    Student() { // Non peramiter Con
    
    }

    // Student(String Name, int Age) { //peramtterse Con
    //     this.Name = Name;
    //     this.Age = Age;
    // }

    Student(Student s2){ // Copy Constructor
       this.Name = s2.Name;
       this.Age = s2.Age;
    }

    public void details() {
        System.out.println(Name);
        System.out.println(Age);
    }

}

public class c1 {

    public static void main(String[] args) {
        Student s1 = new Student();
         s1.Name = "Ravindra";
         s1.Age = 18;

        s1.details();

        Student s2 = new Student(s1);
         s2.Age = 56;
        s2.details();
    }
}
