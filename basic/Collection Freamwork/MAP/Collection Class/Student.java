import java.util.Objects;

public class Student implements Comparable<Student> {

    String name;
    int Roll;

    public Student(String name, int Roll) {
        this.name = name;
        this.Roll = Roll;
    }

    public String toString() {
        return  "Student {" +
         "Name='" + name + '\'' +
        ", RollNo=" + Roll + '}';
    }

    public boolean equals(Object o) {
       if(this == o)  return true;
       if(o == null || getClass() != o.getClass()) return false;
       Student student = (Student) o;
       return Roll == student.Roll;
    }

    public int hashCode() {
        return Objects.hash(Roll); 
    }

    public int compareTo(Student o){
        return this.Roll - o.Roll;
    }

}
